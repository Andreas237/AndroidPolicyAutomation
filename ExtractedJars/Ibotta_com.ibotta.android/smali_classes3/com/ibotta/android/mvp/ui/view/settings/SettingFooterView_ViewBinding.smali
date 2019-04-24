.class public Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView_ViewBinding;
.super Ljava/lang/Object;
.source "SettingFooterView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 19
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;

    const-string v0, "field \'tvMajorVersion\'"

    .line 26
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090597

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->tvMajorVersion:Landroid/widget/TextView;

    const-string v0, "field \'tvMinorVersion\'"

    .line 27
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090598

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->tvMinorVersion:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 35
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;

    .line 37
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->tvMajorVersion:Landroid/widget/TextView;

    .line 38
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->tvMinorVersion:Landroid/widget/TextView;

    return-void

    .line 34
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
