.class public Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView_ViewBinding;
.super Ljava/lang/Object;
.source "TeammateRowView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 20
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;

    const-string v0, "field \'tvRank\'"

    .line 27
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090564

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->tvRank:Landroid/widget/TextView;

    const-string v0, "field \'ivFriendImage\'"

    .line 28
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902be

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->ivFriendImage:Landroid/widget/ImageView;

    const-string v0, "field \'tvFirstName\'"

    .line 29
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090525

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->tvFirstName:Landroid/widget/TextView;

    const-string v0, "field \'tvTotalEarnings\'"

    .line 30
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09058b

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->tvTotalEarnings:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 38
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;

    .line 40
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->tvRank:Landroid/widget/TextView;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->ivFriendImage:Landroid/widget/ImageView;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->tvFirstName:Landroid/widget/TextView;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->tvTotalEarnings:Landroid/widget/TextView;

    return-void

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
