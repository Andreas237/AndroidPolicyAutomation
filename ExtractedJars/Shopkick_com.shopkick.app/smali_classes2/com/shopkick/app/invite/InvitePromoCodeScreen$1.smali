.class Lcom/shopkick/app/invite/InvitePromoCodeScreen$1;
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
        "Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/invite/InvitePromoCodeScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/invite/InvitePromoCodeScreen;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$1;->this$0:Lcom/shopkick/app/invite/InvitePromoCodeScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged(Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V
    .locals 1
    .param p1    # Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$1;->this$0:Lcom/shopkick/app/invite/InvitePromoCodeScreen;

    invoke-static {v0, p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->access$000(Lcom/shopkick/app/invite/InvitePromoCodeScreen;Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V

    return-void
.end method

.method public bridge synthetic onChanged(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 102
    check-cast p1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen$1;->onChanged(Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V

    return-void
.end method
