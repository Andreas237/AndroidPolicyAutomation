.class public Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView_ViewBinding;
.super Ljava/lang/Object;
.source "MyEarningsTeammatesView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;

    const-string v0, "field \'tvMyRanking\'"

    .line 28
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09054c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->tvMyRanking:Landroid/widget/TextView;

    const-string v0, "field \'llTeammatesContainer\'"

    .line 29
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f09032f

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->llTeammatesContainer:Landroid/widget/LinearLayout;

    const-string v0, "field \'bViewAll\'"

    .line 30
    const-class v1, Landroid/widget/Button;

    const v2, 0x7f0900b1

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->bViewAll:Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 38
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;

    .line 40
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->tvMyRanking:Landroid/widget/TextView;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->llTeammatesContainer:Landroid/widget/LinearLayout;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->bViewAll:Landroid/widget/Button;

    return-void

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
