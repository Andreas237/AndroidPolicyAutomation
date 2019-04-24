.class Lcom/shopkick/app/overlays/other/MikaReceiverOverlay$2;
.super Ljava/lang/Object;
.source "MikaReceiverOverlay.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->createView(Landroid/content/Context;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay$2;->this$0:Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 79
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v0, Lcom/shopkick/app/activities/HomeActivity;

    const-class v1, Lcom/shopkick/app/store/EarnScreen;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay$2;->this$0:Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;

    invoke-static {v0}, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->access$000(Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    .line 81
    iget-object p1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay$2;->this$0:Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->dismiss()V

    return-void
.end method
