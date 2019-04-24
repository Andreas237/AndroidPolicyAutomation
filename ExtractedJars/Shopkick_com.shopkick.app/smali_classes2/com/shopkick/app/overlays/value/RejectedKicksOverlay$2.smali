.class Lcom/shopkick/app/overlays/value/RejectedKicksOverlay$2;
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

    .line 71
    iput-object p1, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay$2;->this$0:Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 74
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay$2;->this$0:Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;->dismiss()V

    return-void
.end method
