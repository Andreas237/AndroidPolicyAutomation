.class Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;
.super Ljava/lang/Object;
.source "KicksCenterScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/kicksCenter/KicksCenterScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "KicksCenterButtonClick"
.end annotation


# instance fields
.field private kicksCenterRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/kicksCenter/KicksCenterScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V
    .locals 1

    .line 666
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 667
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;->kicksCenterRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 672
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;->kicksCenterRef:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 673
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;->kicksCenterRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;

    .line 674
    invoke-static {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->access$100(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    .line 675
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 686
    :sswitch_0
    invoke-static {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->access$200(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 687
    invoke-static {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->access$400(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    goto/16 :goto_0

    .line 677
    :sswitch_1
    invoke-virtual {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->popScreen()V

    goto/16 :goto_0

    .line 694
    :sswitch_2
    invoke-static {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->access$600(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    goto/16 :goto_0

    .line 691
    :sswitch_3
    invoke-static {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->access$500(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    goto/16 :goto_0

    .line 698
    :sswitch_4
    invoke-static {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->access$200(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 699
    invoke-static {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->access$700(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    goto :goto_0

    .line 681
    :sswitch_5
    invoke-static {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->access$200(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 682
    invoke-static {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->access$300(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    goto :goto_0

    .line 707
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v1, 0x7f090374

    const/4 v3, 0x4

    if-eq p1, v1, :cond_1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 715
    :pswitch_0
    invoke-static {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->access$100(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 716
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x3f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p1, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 717
    iget-object v1, v0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 718
    invoke-static {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->access$400(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    goto :goto_0

    .line 709
    :pswitch_1
    invoke-static {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->access$100(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 710
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x7c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p1, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 711
    iget-object v1, v0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 712
    invoke-static {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->access$300(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    goto :goto_0

    .line 722
    :cond_1
    :pswitch_2
    invoke-static {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->access$100(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 723
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p1, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 724
    iget-object v0, v0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0901d6 -> :sswitch_5
        0x7f09037d -> :sswitch_5
        0x7f0903b5 -> :sswitch_4
        0x7f0903b8 -> :sswitch_4
        0x7f0903c0 -> :sswitch_3
        0x7f0903cc -> :sswitch_2
        0x7f0903d4 -> :sswitch_1
        0x7f090665 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x7f090379
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
