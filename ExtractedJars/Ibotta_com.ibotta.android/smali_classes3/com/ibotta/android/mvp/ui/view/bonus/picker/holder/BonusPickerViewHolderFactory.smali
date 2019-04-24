.class public Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory;
.super Ljava/lang/Object;
.source "BonusPickerViewHolderFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/AbstractBonusPickerViewHolder;
    .locals 2

    .line 19
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$bonus$picker$BonusPickerRowType:[I

    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->values()[Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    move-result-object v1

    aget-object p2, v1, p2

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->ordinal()I

    move-result p2

    aget p2, v0, p2

    packed-switch p2, :pswitch_data_0

    const/4 p2, 0x0

    goto :goto_0

    .line 33
    :pswitch_0
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TeamworkBonusesViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TeamworkBonusesViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V

    goto :goto_0

    .line 30
    :pswitch_1
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/EmptyBonusViewHolder;

    new-instance v0, Lcom/ibotta/android/views/empty/EmptyView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/views/empty/EmptyView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/EmptyBonusViewHolder;-><init>(Lcom/ibotta/android/views/empty/EmptyView;)V

    goto :goto_0

    .line 27
    :pswitch_2
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusRowViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusRowViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;)V

    goto :goto_0

    .line 24
    :pswitch_3
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TitleBarRowViewHolder;

    new-instance v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/TitleBarRowViewHolder;-><init>(Lcom/ibotta/android/views/base/title/TitleBarView;)V

    goto :goto_0

    .line 21
    :pswitch_4
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/FeaturedBonusesViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V

    :goto_0
    return-object p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
