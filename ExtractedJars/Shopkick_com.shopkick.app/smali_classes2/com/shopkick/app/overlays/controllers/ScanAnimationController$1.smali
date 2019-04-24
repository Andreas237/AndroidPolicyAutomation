.class Lcom/shopkick/app/overlays/controllers/ScanAnimationController$1;
.super Ljava/lang/Object;
.source "ScanAnimationController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->animateCheckmarkExtendedAnimation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/controllers/ScanAnimationController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/controllers/ScanAnimationController;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$1;->this$0:Lcom/shopkick/app/overlays/controllers/ScanAnimationController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$1;->this$0:Lcom/shopkick/app/overlays/controllers/ScanAnimationController;

    invoke-static {v0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->access$100(Lcom/shopkick/app/overlays/controllers/ScanAnimationController;)Lcom/shopkick/app/sounds/SoundManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$1;->this$0:Lcom/shopkick/app/overlays/controllers/ScanAnimationController;

    invoke-static {v1}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->access$000(Lcom/shopkick/app/overlays/controllers/ScanAnimationController;)Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f10000c

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/sounds/SoundManager;->play(Landroid/content/Context;I)V

    return-void
.end method
