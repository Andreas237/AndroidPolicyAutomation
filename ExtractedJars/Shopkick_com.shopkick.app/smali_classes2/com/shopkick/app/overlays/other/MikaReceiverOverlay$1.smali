.class Lcom/shopkick/app/overlays/other/MikaReceiverOverlay$1;
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

    .line 66
    iput-object p1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay$1;->this$0:Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 69
    iget-object p1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay$1;->this$0:Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->dismiss()V

    return-void
.end method