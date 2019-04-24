.class Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/AssistantListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation
.end field

.field final synthetic e:Lcom/huawei/health/sns/ui/chat/AssistantListActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)V
    .locals 1

    .line 280
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;->e:Lcom/huawei/health/sns/ui/chat/AssistantListActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 281
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;->c:Ljava/util/ArrayList;

    .line 282
    return-void
.end method


# virtual methods
.method public d(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 291
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;->c:Ljava/util/ArrayList;

    .line 292
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 303
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 309
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 316
    const/4 v6, 0x0

    .line 317
    if-nez p2, :cond_0

    .line 319
    new-instance v6, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$a;

    invoke-direct {v6}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$a;-><init>()V

    .line 320
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;->e:Lcom/huawei/health/sns/ui/chat/AssistantListActivity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_assistant_list_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 322
    sget v0, Lcom/huawei/android/sns/R$id;->image_head:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v6, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$a;->d:Landroid/widget/ImageView;

    .line 323
    sget v0, Lcom/huawei/android/sns/R$id;->text_title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$a;->c:Landroid/widget/TextView;

    .line 324
    invoke-virtual {p2, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 328
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$a;

    .line 330
    :goto_0
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/user/User;

    .line 332
    if-eqz v7, :cond_1

    .line 334
    iget-object v0, v6, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$a;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;->e:Lcom/huawei/health/sns/ui/chat/AssistantListActivity;

    invoke-virtual {v7, v1}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 335
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    iget-object v2, v6, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$a;->d:Landroid/widget/ImageView;

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    .line 336
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v5

    .line 335
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    :cond_1
    return-object p2
.end method
