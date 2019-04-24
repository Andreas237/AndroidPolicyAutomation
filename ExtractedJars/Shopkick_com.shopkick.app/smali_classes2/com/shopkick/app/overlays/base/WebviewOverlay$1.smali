.class Lcom/shopkick/app/overlays/base/WebviewOverlay$1;
.super Ljava/lang/Object;
.source "WebviewOverlay.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/base/WebviewOverlay;->createView(Landroid/content/Context;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/base/WebviewOverlay;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/base/WebviewOverlay;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay$1;->this$0:Lcom/shopkick/app/overlays/base/WebviewOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 81
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay$1;->this$0:Lcom/shopkick/app/overlays/base/WebviewOverlay;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/base/WebviewOverlay;->dismiss()V

    return-void
.end method
