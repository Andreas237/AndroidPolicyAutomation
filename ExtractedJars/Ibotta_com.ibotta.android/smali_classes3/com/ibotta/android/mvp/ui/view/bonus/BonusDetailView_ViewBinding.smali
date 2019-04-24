.class public Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView_ViewBinding;
.super Ljava/lang/Object;
.source "BonusDetailView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;

    const-string v0, "field \'tbvBonusName\'"

    .line 28
    const-class v1, Lcom/ibotta/android/views/base/title/TitleBarView;

    const v2, 0x7f090445

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->tbvBonusName:Lcom/ibotta/android/views/base/title/TitleBarView;

    const-string v0, "field \'tvDescription\'"

    .line 29
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090515

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->tvDescription:Landroid/widget/TextView;

    const-string v0, "field \'tvExpiration\'"

    .line 30
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090520

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->tvExpiration:Landroid/widget/TextView;

    const-string v0, "field \'rcQualifications\'"

    .line 31
    const-class v1, Landroid/support/v7/widget/RecyclerView;

    const v2, 0x7f0903c1

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->rcQualifications:Landroid/support/v7/widget/RecyclerView;

    const-string v0, "field \'tvTerms\'"

    .line 32
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090584

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->tvTerms:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 40
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->tbvBonusName:Lcom/ibotta/android/views/base/title/TitleBarView;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->tvDescription:Landroid/widget/TextView;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->tvExpiration:Landroid/widget/TextView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->rcQualifications:Landroid/support/v7/widget/RecyclerView;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->tvTerms:Landroid/widget/TextView;

    return-void

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
