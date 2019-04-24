.class Lcom/shopkick/app/overlays/base/WebviewOverlay$2;
.super Ljava/lang/Object;
.source "WebviewOverlay.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/base/WebviewOverlay;->shouldOverrideURLLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
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

    .line 131
    iput-object p1, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay$2;->this$0:Lcom/shopkick/app/overlays/base/WebviewOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/WebviewOverlay$2;->this$0:Lcom/shopkick/app/overlays/base/WebviewOverlay;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/WebviewOverlay;->dismiss()V

    return-void
.end method
