.class Lcom/shopkick/app/invite/InvitePromoCodeScreen$2;
.super Ljava/lang/Object;
.source "InvitePromoCodeScreen.java"

# interfaces
.implements Landroid/arch/lifecycle/Observer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/invite/InvitePromoCodeScreen;->setupView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/arch/lifecycle/Observer<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/invite/InvitePromoCodeScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/invite/InvitePromoCodeScreen;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$2;->this$0:Lcom/shopkick/app/invite/InvitePromoCodeScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged(Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 112
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 113
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$2;->this$0:Lcom/shopkick/app/invite/InvitePromoCodeScreen;

    invoke-static {p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->access$100(Lcom/shopkick/app/invite/InvitePromoCodeScreen;)Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->setIsDataLoading(Z)V

    .line 114
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$2;->this$0:Lcom/shopkick/app/invite/InvitePromoCodeScreen;

    invoke-static {p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->access$100(Lcom/shopkick/app/invite/InvitePromoCodeScreen;)Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->shimmerLoadingSection:Landroid/widget/LinearLayout;

    invoke-static {p1, v0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->access$200(Lcom/shopkick/app/invite/InvitePromoCodeScreen;Landroid/view/ViewGroup;)V

    goto :goto_0

    .line 116
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$2;->this$0:Lcom/shopkick/app/invite/InvitePromoCodeScreen;

    invoke-static {p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->access$100(Lcom/shopkick/app/invite/InvitePromoCodeScreen;)Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->setIsDataLoading(Z)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onChanged(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 109
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen$2;->onChanged(Ljava/lang/Boolean;)V

    return-void
.end method
