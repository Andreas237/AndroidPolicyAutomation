.class public Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingFooterViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/settings/holder/AbstractSettingViewHolder;
.source "SettingFooterViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/settings/holder/AbstractSettingViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final sfvFooter:Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/holder/AbstractSettingViewHolder;-><init>(Landroid/view/View;)V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingFooterViewHolder;->sfvFooter:Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingFooterViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;Lcom/ibotta/android/mvp/ui/activity/settings/SettingAdapterListener;)V
    .locals 1

    .line 21
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/holder/SettingFooterViewHolder;->sfvFooter:Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;->getMajor()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;->getMinor()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->setVersion(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
