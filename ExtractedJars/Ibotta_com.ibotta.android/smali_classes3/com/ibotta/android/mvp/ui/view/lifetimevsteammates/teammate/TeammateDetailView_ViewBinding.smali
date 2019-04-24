.class public Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView_ViewBinding;
.super Ljava/lang/Object;
.source "TeammateDetailView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 22
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;

    const-string v0, "field \'llMessage\'"

    .line 29
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090317

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->llMessage:Landroid/widget/LinearLayout;

    const-string v0, "field \'tvMessage\'"

    .line 30
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090548

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->tvMessage:Landroid/widget/TextView;

    const-string v0, "field \'tvDate\'"

    .line 31
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090512

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->tvDate:Landroid/widget/TextView;

    const-string v0, "field \'tbvLifetimeEarningsName\'"

    .line 32
    const-class v1, Lcom/ibotta/android/views/base/title/TitleBarView;

    const v2, 0x7f09044a

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->tbvLifetimeEarningsName:Lcom/ibotta/android/views/base/title/TitleBarView;

    const-string v0, "field \'tvLineLifetimeEarningsAmount\'"

    .line 33
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090540

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->tvLineLifetimeEarningsAmount:Landroid/widget/TextView;

    const-string v0, "field \'llLifetimeEarningsTitleContainer\'"

    .line 34
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090312

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->llLifetimeEarningsTitleContainer:Landroid/widget/LinearLayout;

    const-string v0, "field \'lgvLineGraph\'"

    .line 35
    const-class v1, Lcom/ibotta/android/view/graph/line/LineGraphView;

    const v2, 0x7f0902ef

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/view/graph/line/LineGraphView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->lgvLineGraph:Lcom/ibotta/android/view/graph/line/LineGraphView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 43
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->llMessage:Landroid/widget/LinearLayout;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->tvMessage:Landroid/widget/TextView;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->tvDate:Landroid/widget/TextView;

    .line 48
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->tbvLifetimeEarningsName:Lcom/ibotta/android/views/base/title/TitleBarView;

    .line 49
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->tvLineLifetimeEarningsAmount:Landroid/widget/TextView;

    .line 50
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->llLifetimeEarningsTitleContainer:Landroid/widget/LinearLayout;

    .line 51
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->lgvLineGraph:Lcom/ibotta/android/view/graph/line/LineGraphView;

    return-void

    .line 42
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
