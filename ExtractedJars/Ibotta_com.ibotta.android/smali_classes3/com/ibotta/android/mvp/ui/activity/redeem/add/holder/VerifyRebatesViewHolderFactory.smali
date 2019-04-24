.class public Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifyRebatesViewHolderFactory;
.super Ljava/lang/Object;
.source "VerifyRebatesViewHolderFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/AbstractVerifyRebatesViewHolder;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 20
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifyRebatesViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$redeem$add$VerifyRebatesRowType:[I

    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRowType;->values()[Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRowType;

    move-result-object v1

    aget-object p2, v1, p2

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRowType;->ordinal()I

    move-result p2

    aget p2, v0, p2

    packed-switch p2, :pswitch_data_0

    const/4 p2, 0x0

    goto :goto_0

    .line 25
    :pswitch_0
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifiableRebateViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/VerifiableRebateViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;)V

    goto :goto_0

    .line 22
    :pswitch_1
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/TitleBarViewHolder;

    new-instance v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/holder/TitleBarViewHolder;-><init>(Lcom/ibotta/android/views/base/title/TitleBarView;)V

    :goto_0
    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
