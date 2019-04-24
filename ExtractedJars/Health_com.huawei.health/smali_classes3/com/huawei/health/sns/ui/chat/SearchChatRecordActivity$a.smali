.class Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation
.end field

.field final synthetic e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V
    .locals 1

    .line 426
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 427
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->a:Ljava/util/ArrayList;

    .line 428
    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 432
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->a:Ljava/util/ArrayList;

    .line 433
    return-void
.end method

.method public c()V
    .locals 1

    .line 437
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 438
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 443
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->a:Ljava/util/ArrayList;

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

    .line 449
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->a:Ljava/util/ArrayList;

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

    .line 455
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .line 461
    const/4 v6, 0x0

    .line 462
    if-nez p2, :cond_0

    .line 464
    new-instance v6, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;-><init>(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$4;)V

    .line 465
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_search_record_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 467
    sget v0, Lcom/huawei/android/sns/R$id;->head_pic:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v6, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;->b(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 468
    sget v0, Lcom/huawei/android/sns/R$id;->sns_txt_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v6, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;->b(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 469
    sget v0, Lcom/huawei/android/sns/R$id;->sns_txt_content:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v6, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;->a(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 470
    sget v0, Lcom/huawei/android/sns/R$id;->sns_txt_time:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v6, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;->d(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 471
    invoke-virtual {p2, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 476
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;

    .line 478
    :goto_0
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 480
    if-eqz v7, :cond_4

    .line 482
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 484
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->h(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 486
    invoke-static {v6}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;->e(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->h(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bbk;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 487
    invoke-static {v6}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;->a(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->h(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getNickName_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 492
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->g(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 494
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->b(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-static {v6}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;->e(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;)Landroid/widget/ImageView;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v3}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->b(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    .line 495
    invoke-static {v4}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->b(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v5}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->b(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v5

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v5

    .line 494
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    invoke-static {v6}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;->a(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->b(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v1

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v2

    invoke-virtual {v2}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 501
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->i(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)J

    move-result-wide v1

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v3

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->c(JJLcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;)V

    .line 504
    :cond_3
    :goto_1
    invoke-static {v6}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;->d(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 505
    invoke-static {v6}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;->b(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgDate()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bog;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 507
    :cond_4
    return-object p2
.end method
