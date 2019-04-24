.class Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$ResoureDownCallBack;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aff;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ResoureDownCallBack"
.end annotation


# instance fields
.field private mFragment:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 1

    .line 626
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 627
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$ResoureDownCallBack;->mFragment:Ljava/lang/ref/WeakReference;

    .line 628
    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/String;)V
    .locals 5

    .line 632
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$ResoureDownCallBack;->mFragment:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 633
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResoureDownCallBack mFragment is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 634
    return-void

    .line 636
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$ResoureDownCallBack;->mFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    .line 637
    if-nez v4, :cond_1

    .line 638
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResoureDownCallBack mFragment.get() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 639
    return-void

    .line 641
    :cond_1
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 642
    return-void

    .line 644
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_3

    .line 645
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResoureDownCallBack mFragment is not add"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 646
    return-void

    .line 648
    :cond_3
    invoke-virtual {p0, v4, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$ResoureDownCallBack;->onResult(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;ILjava/lang/String;)V

    .line 650
    return-void
.end method

.method public onResult(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;ILjava/lang/String;)V
    .locals 6

    .line 652
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1900(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Ljava/lang/String;

    move-result-object v4

    .line 653
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 654
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResoureDownCallBack mProductId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 655
    return-void

    .line 657
    :cond_0
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 658
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResoureDownCallBack myHandler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 659
    return-void

    .line 661
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ResoureDownCallBack resultCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "productID:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 662
    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 663
    const/16 v0, 0xc8

    if-ne p2, v0, :cond_2

    .line 664
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 665
    const/4 v0, 0x1

    iput v0, v5, Landroid/os/Message;->what:I

    .line 666
    iput-object p3, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 667
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 668
    goto :goto_0

    .line 669
    :cond_2
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;->sendEmptyMessage(I)Z

    .line 672
    :cond_3
    :goto_0
    return-void
.end method
