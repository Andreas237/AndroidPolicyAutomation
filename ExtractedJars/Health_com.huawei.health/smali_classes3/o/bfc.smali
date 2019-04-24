.class public Lo/bfc;
.super Lo/beo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bfc$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2}, Lo/beo;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    .line 60
    return-void
.end method

.method private a(Ljava/lang/String;I)I
    .locals 3

    .line 374
    const/4 v1, 0x0

    .line 377
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 382
    goto :goto_0

    .line 379
    :catch_0
    move-exception v2

    .line 381
    move v1, p2

    .line 383
    :goto_0
    return v1
.end method

.method private a(Landroid/view/View;Z)V
    .locals 2

    .line 237
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/bfc$a;

    .line 239
    sget v0, Lcom/huawei/android/sns/R$id;->head_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/bfc$a;->m:Landroid/widget/ImageView;

    .line 240
    sget v0, Lcom/huawei/android/sns/R$id;->chat_message_repeat_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/bfc$a;->p:Landroid/widget/ImageView;

    .line 241
    sget v0, Lcom/huawei/android/sns/R$id;->chat_pic_progress:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, v1, Lo/bfc$a;->l:Landroid/widget/ProgressBar;

    .line 242
    if-nez p2, :cond_0

    .line 245
    sget v0, Lcom/huawei/android/sns/R$id;->chat_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bfc$a;->o:Landroid/widget/TextView;

    .line 247
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->checkbox_status_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lo/bfc$a;->n:Landroid/widget/CheckBox;

    .line 248
    sget v0, Lcom/huawei/android/sns/R$id;->time_line_viewstub:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, v1, Lo/bfc$a;->t:Landroid/view/ViewStub;

    .line 250
    sget v0, Lcom/huawei/android/sns/R$id;->share_msg_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bfc$a;->a:Landroid/widget/TextView;

    .line 251
    sget v0, Lcom/huawei/android/sns/R$id;->share_msg_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/bfc$a;->b:Landroid/widget/ImageView;

    .line 252
    sget v0, Lcom/huawei/android/sns/R$id;->share_msg_content:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bfc$a;->d:Landroid/widget/TextView;

    .line 254
    sget v0, Lcom/huawei/android/sns/R$id;->msg_item_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/bfc$a;->e:Landroid/widget/LinearLayout;

    .line 255
    sget v0, Lcom/huawei/android/sns/R$id;->link_msg_tail:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/bfc$a;->c:Landroid/widget/LinearLayout;

    .line 256
    sget v0, Lcom/huawei/android/sns/R$id;->share_app_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/bfc$a;->h:Landroid/widget/ImageView;

    .line 257
    sget v0, Lcom/huawei/android/sns/R$id;->share_app_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bfc$a;->f:Landroid/widget/TextView;

    .line 258
    sget v0, Lcom/huawei/android/sns/R$id;->content_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/bfc$a;->u:Landroid/widget/LinearLayout;

    .line 259
    return-void
.end method

.method private a(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V
    .locals 12

    .line 311
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->isLinkUrlHasAppInfo()Z

    move-result v5

    .line 312
    if-eqz v5, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrlPackageName()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkAppPackage()Ljava/lang/String;

    move-result-object v6

    .line 313
    :goto_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 315
    const-string v0, "ShareLinkView"

    const-string v1, "checkClickLink packageName is empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 318
    const-string v0, "ShareLinkView"

    const-string v1, "checkClickLink url is app, not empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    new-instance v0, Lo/bcu;

    iget-object v1, p0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-direct {v0, v1}, Lo/bcu;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bcu;->c(Ljava/lang/String;)Z

    move-result v7

    .line 321
    if-nez v7, :cond_1

    .line 323
    iget-object v0, p0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_start_app_failed:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 326
    :cond_1
    return-void

    .line 330
    :cond_2
    iget-object v0, p0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-static {v0, v6}, Lo/bnx;->b(Landroid/content/ContextWrapper;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 333
    if-eqz v5, :cond_3

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrlAppVersion()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkReqVerCode()Ljava/lang/String;

    move-result-object v7

    .line 334
    :goto_1
    const/4 v0, 0x1

    invoke-direct {p0, v7, v0}, Lo/bfc;->a(Ljava/lang/String;I)I

    move-result v8

    .line 335
    iget-object v0, p0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-static {v0, v6}, Lo/bnx;->e(Landroid/content/ContextWrapper;Ljava/lang/String;)I

    move-result v9

    .line 336
    if-le v8, v9, :cond_5

    .line 339
    if-eqz v5, :cond_4

    iget-object v0, p0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-static {v0, v6}, Lo/bnx;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkAppName()Ljava/lang/String;

    move-result-object v10

    .line 340
    :goto_2
    iget-object v0, p0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_update_app_dialog_tip:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 341
    invoke-static {v10}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 340
    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 342
    sget v0, Lcom/huawei/android/sns/R$string;->sns_update_app_action:I

    invoke-direct {p0, v11, v0, p1}, Lo/bfc;->b(Ljava/lang/String;ILcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V

    .line 343
    goto :goto_3

    .line 347
    :cond_5
    new-instance v10, Lo/bcu;

    iget-object v0, p0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-direct {v10, v0}, Lo/bcu;-><init>(Landroid/app/Activity;)V

    .line 348
    invoke-virtual {v10, v6}, Lo/bcu;->b(Ljava/lang/String;)V

    .line 349
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/bcu;->c(Ljava/lang/String;)Z

    move-result v11

    .line 350
    if-nez v11, :cond_6

    .line 352
    iget-object v0, p0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_start_app_failed:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 355
    :cond_6
    :goto_3
    goto :goto_5

    .line 359
    :cond_7
    if-eqz v5, :cond_8

    iget-object v0, p0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_install_url_app_dialog_tip:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    :cond_8
    iget-object v0, p0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_install_app_dialog_tip:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 360
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkAppName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 361
    :goto_4
    sget v0, Lcom/huawei/android/sns/R$string;->sns_install_app_action:I

    invoke-direct {p0, v7, v0, p1}, Lo/bfc;->b(Ljava/lang/String;ILcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V

    .line 363
    :goto_5
    return-void
.end method

.method private b(Ljava/lang/String;ILcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V
    .locals 6

    .line 393
    iget-object v0, p0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    const-string v1, ""

    move-object v2, p1

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    move v4, p2

    new-instance v5, Lo/bfc$5;

    invoke-direct {v5, p0, p3}, Lo/bfc$5;-><init>(Lo/bfc;Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 409
    return-void
.end method

.method private c(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;Lo/bfc$a;)V
    .locals 3

    .line 156
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkTitle()Ljava/lang/String;

    move-result-object v2

    .line 157
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    iget-object v0, p2, Lo/bfc$a;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 164
    :cond_0
    iget-object v0, p2, Lo/bfc$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 168
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkBrief()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 170
    iget-object v0, p2, Lo/bfc$a;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 174
    :cond_1
    iget-object v0, p2, Lo/bfc$a;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkBrief()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    :goto_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkAppName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 180
    iget-object v0, p2, Lo/bfc$a;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkAppName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    iget-object v0, p2, Lo/bfc$a;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 183
    :cond_2
    return-void
.end method

.method private c(Lo/bfc$a;)V
    .locals 2

    .line 150
    iget-object v0, p1, Lo/bfc$a;->e:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_chat_right_socity_msg_selector:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 151
    return-void
.end method

.method static synthetic c(Lo/bfc;Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lo/bfc;->a(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V

    return-void
.end method

.method private d(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V
    .locals 5

    .line 454
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->isLinkUrlHasAppInfo()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrlAppId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkAppID()Ljava/lang/String;

    move-result-object v2

    .line 455
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://a.vmall.com/app/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 457
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 458
    iget-object v0, p0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    const-string v1, "com.android.browser"

    invoke-static {v0, v4, v1}, Lo/bnx;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    .line 459
    return-void
.end method

.method private e(ZLandroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 99
    const/4 v2, 0x0

    .line 100
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 101
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/bfc$a;

    if-eqz v0, :cond_0

    .line 103
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bfc$a;

    goto :goto_1

    .line 107
    :cond_0
    if-eqz p1, :cond_1

    sget v3, Lcom/huawei/android/sns/R$layout;->sns_share_link_right_item:I

    goto :goto_0

    :cond_1
    sget v3, Lcom/huawei/android/sns/R$layout;->sns_share_link_left_item:I

    .line 108
    :goto_0
    iget-object v0, p0, Lo/bfc;->b:Landroid/view/LayoutInflater;

    const/4 v1, 0x0

    invoke-virtual {v0, v3, p4, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 110
    new-instance v2, Lo/bfc$a;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lo/bfc$a;-><init>(Lo/bfc$2;)V

    .line 112
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 114
    invoke-direct {p0, p2, p1}, Lo/bfc;->a(Landroid/view/View;Z)V

    .line 116
    :goto_1
    if-eqz p1, :cond_2

    .line 118
    invoke-direct {p0, v2}, Lo/bfc;->c(Lo/bfc$a;)V

    .line 120
    :cond_2
    invoke-virtual {p0, p3, v2}, Lo/bfc;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 121
    invoke-virtual {p0, p3, v2}, Lo/bfc;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 124
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v0

    invoke-direct {p0, v0, v2}, Lo/bfc;->e(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lo/bfc$a;)V

    .line 125
    if-eqz p1, :cond_3

    .line 128
    invoke-virtual {p0, v2, p3}, Lo/bfc;->c(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_2

    .line 133
    :cond_3
    invoke-virtual {p0, p3}, Lo/bfc;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 135
    :goto_2
    invoke-virtual {p0, p3, p2, v2}, Lo/bfc;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 136
    iget-object v0, v2, Lo/bfc$a;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p3, v0, v2}, Lo/bfc;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 138
    invoke-direct {p0, p3, v2}, Lo/bfc;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bfc$a;)V

    .line 140
    return-object p2
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bfc$a;)V
    .locals 2

    .line 269
    iget-object v0, p2, Lo/bfc$a;->e:Landroid/widget/LinearLayout;

    new-instance v1, Lo/bfc$2;

    invoke-direct {v1, p0, p1, p2}, Lo/bfc$2;-><init>(Lo/bfc;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bfc$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 301
    return-void
.end method

.method private e(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V
    .locals 5

    .line 435
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->isLinkUrlHasAppInfo()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrlPackageName()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkAppPackage()Ljava/lang/String;

    move-result-object v2

    .line 436
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "market://details?id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 437
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v4, v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 438
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 439
    iget-object v0, p0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 445
    goto :goto_1

    .line 441
    :catch_0
    move-exception v2

    .line 443
    const-string v0, "ShareLinkView"

    const-string v1, "open hispace error, try to open web page"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 444
    invoke-direct {p0, p1}, Lo/bfc;->d(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V

    .line 446
    :goto_1
    return-void
.end method

.method private e(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lo/bfc$a;)V
    .locals 8

    .line 193
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->f:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_4

    .line 195
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 198
    invoke-direct {p0, v3, p2}, Lo/bfc;->c(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;Lo/bfc$a;)V

    .line 200
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getBlobItemList()Ljava/util/ArrayList;

    move-result-object v4

    .line 201
    if-eqz v4, :cond_4

    .line 203
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    .line 205
    const/4 v7, 0x0

    .line 206
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getLocalBlobDataPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 208
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getLocalBlobDataPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v7

    goto :goto_1

    .line 212
    :cond_0
    const-string v0, "ShareLinkView"

    const-string v1, "trace link item local blob data path is null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    :goto_1
    const-string v0, "ShareLinkView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "trace link item info img "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v7, :cond_1

    const/4 v2, 0x1

    goto :goto_2

    :cond_1
    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    if-eqz v7, :cond_3

    .line 217
    const-string v0, "link"

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobPosition()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 219
    iget-object v0, p2, Lo/bfc$a;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_3

    .line 221
    :cond_2
    const-string v0, "app"

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobPosition()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 222
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkAppName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 225
    iget-object v0, p2, Lo/bfc$a;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 226
    iget-object v0, p2, Lo/bfc$a;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 227
    iget-object v0, p2, Lo/bfc$a;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 230
    :cond_3
    :goto_3
    goto/16 :goto_0

    .line 233
    :cond_4
    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V
    .locals 2

    .line 417
    iget-object v0, p0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    const-string v1, "com.huawei.appmarket"

    invoke-static {v0, v1}, Lo/bnx;->b(Landroid/content/ContextWrapper;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 419
    invoke-direct {p0, p1}, Lo/bfc;->e(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V

    goto :goto_0

    .line 423
    :cond_0
    invoke-direct {p0, p1}, Lo/bfc;->d(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V

    .line 425
    :goto_0
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 72
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 74
    const/4 v0, 0x0

    return-object v0

    .line 77
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 79
    const/4 v0, 0x0

    invoke-direct {p0, v0, p2, p1, p3}, Lo/bfc;->e(ZLandroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 83
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v0, p2, p1, p3}, Lo/bfc;->e(ZLandroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
