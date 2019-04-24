.class public Lo/erb;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/erb$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/erb$b;>;"
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;)V"
        }
    .end annotation

    .line 51
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 52
    iput-object p1, p0, Lo/erb;->b:Landroid/content/Context;

    .line 53
    iput-object p2, p0, Lo/erb;->c:Ljava/util/List;

    .line 54
    return-void
.end method

.method static synthetic a(Lo/erb;)Landroid/content/Context;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/erb;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lo/erb;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lo/erb;->d(Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 170
    const-string v4, "html"

    .line 171
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 172
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 174
    const-string v0, ""

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 176
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 177
    const-string v0, "type"

    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 180
    :cond_0
    const-string v0, "OperationRecycleViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8df3\u8f6c\u7c7b\u578b\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    return-object v4
.end method

.method static synthetic b(Lo/erb;)Ljava/util/List;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/erb;->c:Ljava/util/List;

    return-object v0
.end method

.method private b(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 5

    .line 105
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 106
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    const-string v0, "msgId"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    const-string v0, "msgTitle"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/erb;->b:Landroid/content/Context;

    sget-object v2, Lo/dae;->bU:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 110
    return-void
.end method

.method private b(Lo/erb$b;I)V
    .locals 2

    .line 73
    iget-object v0, p1, Lo/erb$b;->itemView:Landroid/view/View;

    new-instance v1, Lo/erb$4;

    invoke-direct {v1, p0, p2}, Lo/erb$4;-><init>(Lo/erb;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    return-void
.end method

.method static synthetic b(Lo/erb;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Lo/erb;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lo/erb;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lo/erb;->b(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    return-void
.end method

.method static synthetic d(Lo/erb;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 37
    invoke-direct {p0, p1, p2}, Lo/erb;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    .line 150
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/erb;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 151
    const-string v0, "url"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 152
    iget-object v0, p0, Lo/erb;->b:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 153
    return-void
.end method

.method private d(Lo/erb$b;I)V
    .locals 7

    .line 113
    iget-object v0, p0, Lo/erb;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 114
    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getImgUri()Ljava/lang/String;

    move-result-object v4

    .line 115
    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v5

    .line 116
    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgContent()Ljava/lang/String;

    move-result-object v6

    .line 117
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 118
    iget-object v0, p0, Lo/erb;->b:Landroid/content/Context;

    invoke-static {p1}, Lo/erb$b;->e(Lo/erb$b;)Landroid/widget/ImageView;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v0, v4, v1, v2}, Lo/fic;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 120
    :cond_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 121
    invoke-static {p1}, Lo/erb$b;->b(Lo/erb$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    :cond_1
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 124
    invoke-static {p1}, Lo/erb$b;->a(Lo/erb$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 125
    invoke-static {p1}, Lo/erb$b;->a(Lo/erb$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 127
    :cond_2
    invoke-static {p1}, Lo/erb$b;->a(Lo/erb$b;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 129
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 133
    move-object v2, p1

    const/4 v3, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "html"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :sswitch_1
    const-string v0, "medal"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    :cond_0
    :goto_0
    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    .line 135
    :sswitch_2
    invoke-direct {p0, p2}, Lo/erb;->d(Ljava/lang/String;)V

    .line 136
    goto :goto_2

    .line 138
    :sswitch_3
    iget-object v0, p0, Lo/erb;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lo/erb;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dth;->k(Landroid/content/Context;)V

    .line 139
    goto :goto_2

    .line 141
    :goto_1
    invoke-direct {p0, p2}, Lo/erb;->d(Ljava/lang/String;)V

    .line 144
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3107ab -> :sswitch_0
        0x62f6ef7 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x0 -> :sswitch_2
        0x1 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public a(Lo/erb$b;I)V
    .locals 4

    .line 65
    const-string v0, "OperationRecycleViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u7ed8\u5236\u754c\u9762\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    iget-object v0, p0, Lo/erb;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/erb;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    iget-object v0, p0, Lo/erb;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 67
    invoke-direct {p0, p1, p2}, Lo/erb;->d(Lo/erb$b;I)V

    .line 68
    invoke-direct {p0, p1, p2}, Lo/erb;->b(Lo/erb$b;I)V

    .line 70
    :cond_0
    return-void
.end method

.method public b(Landroid/view/ViewGroup;I)Lo/erb$b;
    .locals 4

    .line 58
    new-instance v3, Lo/erb$b;

    iget-object v0, p0, Lo/erb;->b:Landroid/content/Context;

    .line 59
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->item_operation_card:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/erb$b;-><init>(Landroid/view/View;)V

    .line 60
    return-object v3
.end method

.method public getItemCount()I
    .locals 1

    .line 157
    iget-object v0, p0, Lo/erb;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lo/erb;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 160
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 37
    move-object v0, p1

    check-cast v0, Lo/erb$b;

    invoke-virtual {p0, v0, p2}, Lo/erb;->a(Lo/erb$b;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 37
    invoke-virtual {p0, p1, p2}, Lo/erb;->b(Landroid/view/ViewGroup;I)Lo/erb$b;

    move-result-object v0

    return-object v0
.end method
