.class public Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/settings/holder/AbstractSettingViewHolder;
.source "SettingMenuViewHolder.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/settings/holder/AbstractSettingViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;",
        ">;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;

.field private settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field private final smvMenu:Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/holder/AbstractSettingViewHolder;-><init>(Landroid/view/View;)V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder;->smvMenu:Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder;->onSettingMenuViewClicked()V

    return-void
.end method

.method private onSettingMenuViewClicked()V
    .locals 2

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;

    if-eqz v0, :cond_0

    .line 42
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder;->settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;->onRowClicked(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;)V
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;)V
    .locals 1

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;->getSettingMenu()Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder;->settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;

    .line 30
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder;->smvMenu:Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder;->settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->setSettingMenu(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V

    .line 31
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder;->smvMenu:Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->setCustomer(Lcom/ibotta/api/model/customer/Customer;)V

    .line 32
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder;->smvMenu:Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;

    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder$1;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingMenuViewHolder;)V

    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method
