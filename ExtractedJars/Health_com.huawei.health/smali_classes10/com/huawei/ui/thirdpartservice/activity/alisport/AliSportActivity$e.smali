.class Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)V
    .locals 1

    .line 305
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 306
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$e;->c:Ljava/lang/ref/WeakReference;

    .line 307
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity$e;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;

    .line 312
    if-nez v4, :cond_0

    .line 313
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 314
    return-void

    .line 316
    :cond_0
    const-string v0, "AliSportActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage msg is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 319
    :pswitch_0
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;Z)V

    .line 320
    goto :goto_0

    .line 322
    :pswitch_1
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;Z)V

    .line 323
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hwh_ali_sport_auth_failed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 324
    goto :goto_0

    .line 326
    :pswitch_2
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;Z)V

    .line 327
    goto :goto_0

    .line 329
    :pswitch_3
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hwh_ali_sport_net_error:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 330
    goto :goto_0

    .line 332
    :pswitch_4
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;Z)V

    .line 333
    goto :goto_0

    .line 335
    :pswitch_5
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_connect_error:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 336
    .line 340
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
