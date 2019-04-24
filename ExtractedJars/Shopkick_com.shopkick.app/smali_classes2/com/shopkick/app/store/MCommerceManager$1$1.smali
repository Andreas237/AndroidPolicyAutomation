.class Lcom/shopkick/app/store/MCommerceManager$1$1;
.super Ljava/lang/Object;
.source "MCommerceManager.java"

# interfaces
.implements Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/MCommerceManager$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/app/store/MCommerceManager$1;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/MCommerceManager$1;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager$1$1;->this$1:Lcom/shopkick/app/store/MCommerceManager$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onOverlayReplaceFailed(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 1

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/store/MCommerceManager$1$1;->this$1:Lcom/shopkick/app/store/MCommerceManager$1;

    iget-object p1, p1, Lcom/shopkick/app/store/MCommerceManager$1;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/store/MCommerceManager;->access$002(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/store/MCommerceManager$1$1;->this$1:Lcom/shopkick/app/store/MCommerceManager$1;

    iget-object p1, p1, Lcom/shopkick/app/store/MCommerceManager$1;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {p1}, Lcom/shopkick/app/store/MCommerceManager;->access$200(Lcom/shopkick/app/store/MCommerceManager;)V

    return-void
.end method

.method public onOverlayReplaceSuccess(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    return-void
.end method
