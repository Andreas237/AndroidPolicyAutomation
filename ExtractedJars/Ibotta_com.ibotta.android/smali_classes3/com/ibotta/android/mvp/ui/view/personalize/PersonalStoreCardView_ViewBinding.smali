.class public Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView_ViewBinding;
.super Ljava/lang/Object;
.source "PersonalStoreCardView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;

    const-string v0, "field \'ivRetailerLogo\'"

    .line 28
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902c2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->ivRetailerLogo:Landroid/widget/ImageView;

    const-string v0, "field \'flItemSelectedOverlay\'"

    .line 29
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f0901f2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->flItemSelectedOverlay:Landroid/widget/FrameLayout;

    const-string v0, "field \'ivStarSelectedOverlay\'"

    .line 30
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902ca

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->ivStarSelectedOverlay:Landroid/widget/ImageView;

    const-string v0, "field \'tvName\'"

    .line 31
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09054d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->tvName:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 39
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->ivRetailerLogo:Landroid/widget/ImageView;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->flItemSelectedOverlay:Landroid/widget/FrameLayout;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->ivStarSelectedOverlay:Landroid/widget/ImageView;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->tvName:Landroid/widget/TextView;

    return-void

    .line 38
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
