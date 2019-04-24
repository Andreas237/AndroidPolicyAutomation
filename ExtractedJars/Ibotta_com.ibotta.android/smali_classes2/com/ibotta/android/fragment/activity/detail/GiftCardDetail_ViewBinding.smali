.class public Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail_ViewBinding;
.super Ljava/lang/Object;
.source "GiftCardDetail_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail_ViewBinding;->target:Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;

    const-string v0, "field \'llGiftCard\'"

    .line 23
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f09030c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->llGiftCard:Landroid/widget/LinearLayout;

    const-string v0, "field \'tbvTitleBar\'"

    .line 24
    const-class v1, Lcom/ibotta/android/views/base/title/TitleBarView;

    const v2, 0x7f09044e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    iput-object v0, p1, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    const-string v0, "field \'tvDescription\'"

    .line 25
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090515

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->tvDescription:Landroid/widget/TextView;

    const-string v0, "field \'tvTransactionAmount\'"

    .line 26
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09058d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->tvTransactionAmount:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail_ViewBinding;->target:Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 34
    iput-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail_ViewBinding;->target:Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;

    .line 36
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->llGiftCard:Landroid/widget/LinearLayout;

    .line 37
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    .line 38
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->tvDescription:Landroid/widget/TextView;

    .line 39
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->tvTransactionAmount:Landroid/widget/TextView;

    return-void

    .line 33
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
