.class final Lo/bms$d;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bms;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bms$d$e;
    }
.end annotation


# instance fields
.field final synthetic d:Lo/bms;


# direct methods
.method private constructor <init>(Lo/bms;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lo/bms$d;->d:Lo/bms;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/bms;Lo/bms$2;)V
    .locals 0

    .line 178
    invoke-direct {p0, p1}, Lo/bms$d;-><init>(Lo/bms;)V

    return-void
.end method

.method private d(Landroid/view/View;I)V
    .locals 2

    .line 225
    invoke-virtual {p0}, Lo/bms$d;->getCount()I

    move-result v1

    .line 226
    if-nez p2, :cond_1

    .line 228
    add-int/lit8 v0, v1, -0x1

    if-ne p2, v0, :cond_0

    .line 231
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_sub_menu_round_selector:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 236
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_sub_menu_top_selector:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 239
    :cond_1
    add-int/lit8 v0, v1, -0x1

    if-ne p2, v0, :cond_2

    .line 242
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_sub_menu_bottom_selector:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 247
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_sub_menu_normal_selector:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 249
    :goto_0
    return-void
.end method


# virtual methods
.method public e(I)Lcom/huawei/health/sns/model/chat/AssistantMenu;
    .locals 1

    .line 188
    iget-object v0, p0, Lo/bms$d;->d:Lo/bms;

    invoke-static {v0}, Lo/bms;->d(Lo/bms;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/AssistantMenu;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 183
    iget-object v0, p0, Lo/bms$d;->d:Lo/bms;

    invoke-static {v0}, Lo/bms;->d(Lo/bms;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .line 178
    invoke-virtual {p0, p1}, Lo/bms$d;->e(I)Lcom/huawei/health/sns/model/chat/AssistantMenu;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 193
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 198
    const/4 v2, 0x0

    .line 199
    if-nez p2, :cond_0

    .line 201
    iget-object v0, p0, Lo/bms$d;->d:Lo/bms;

    invoke-static {v0}, Lo/bms;->e(Lo/bms;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 202
    new-instance v2, Lo/bms$d$e;

    invoke-direct {v2, p0}, Lo/bms$d$e;-><init>(Lo/bms$d;)V

    .line 203
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_assist_pop_menu_listitem:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 204
    sget v0, Lcom/huawei/android/sns/R$id;->menu_item_tv:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lo/bms$d$e;->e:Landroid/widget/TextView;

    .line 205
    sget v0, Lcom/huawei/android/sns/R$id;->menu_item_container:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lo/bms$d$e;->d:Landroid/view/View;

    .line 206
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 207
    goto :goto_0

    .line 210
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bms$d$e;

    .line 212
    :goto_0
    iget-object v0, v2, Lo/bms$d$e;->e:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Lo/bms$d;->e(I)Lcom/huawei/health/sns/model/chat/AssistantMenu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 213
    iget-object v0, v2, Lo/bms$d$e;->d:Landroid/view/View;

    invoke-direct {p0, v0, p1}, Lo/bms$d;->d(Landroid/view/View;I)V

    .line 214
    return-object p2
.end method
