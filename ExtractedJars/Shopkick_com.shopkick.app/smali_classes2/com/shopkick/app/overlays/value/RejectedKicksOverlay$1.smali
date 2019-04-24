.class Lcom/shopkick/app/overlays/value/RejectedKicksOverlay$1;
.super Ljava/lang/Object;
.source "RejectedKicksOverlay.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay$1;->this$0:Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 58
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay$1;->this$0:Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;

    invoke-static {p1}, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->access$000(Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonUrl:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 59
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay$1;->this$0:Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;

    invoke-static {p1}, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->access$200(Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay$1;->this$0:Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;

    invoke-static {v0}, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->access$100(Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    .line 61
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay$1;->this$0:Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->dismiss()V

    return-void
.end method
