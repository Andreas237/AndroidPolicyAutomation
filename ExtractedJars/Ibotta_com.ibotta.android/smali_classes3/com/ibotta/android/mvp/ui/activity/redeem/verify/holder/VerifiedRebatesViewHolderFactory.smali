.class public Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiedRebatesViewHolderFactory;
.super Ljava/lang/Object;
.source "VerifiedRebatesViewHolderFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;
    .locals 2

    .line 18
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiedRebatesViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$redeem$verify$VerifiedRebatesRowType:[I

    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->values()[Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    move-result-object v1

    aget-object p2, v1, p2

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->ordinal()I

    move-result p2

    aget p2, v0, p2

    packed-switch p2, :pswitch_data_0

    const/4 p2, 0x0

    goto :goto_0

    .line 26
    :pswitch_0
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiableRebateViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/VerifiableRebateViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;)V

    goto :goto_0

    .line 23
    :pswitch_1
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/TitleBarViewHolder;

    new-instance v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/TitleBarViewHolder;-><init>(Lcom/ibotta/android/views/base/title/TitleBarView;)V

    goto :goto_0

    .line 20
    :pswitch_2
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AddRebatesViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AddRebatesViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;)V

    :goto_0
    return-object p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
