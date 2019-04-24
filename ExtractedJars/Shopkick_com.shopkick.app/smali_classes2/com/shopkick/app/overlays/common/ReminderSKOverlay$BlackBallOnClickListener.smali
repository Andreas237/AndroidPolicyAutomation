.class Lcom/shopkick/app/overlays/common/ReminderSKOverlay$BlackBallOnClickListener;
.super Ljava/lang/Object;
.source "ReminderSKOverlay.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/common/ReminderSKOverlay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "BlackBallOnClickListener"
.end annotation


# instance fields
.field private overlayRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/overlays/common/ReminderSKOverlay;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/overlays/common/ReminderSKOverlay;)V
    .locals 1

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 90
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay$BlackBallOnClickListener;->overlayRef:Ljava/lang/ref/WeakReference;

    .line 93
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay$BlackBallOnClickListener;->overlayRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ReminderSKOverlay$BlackBallOnClickListener;->overlayRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;

    if-nez p1, :cond_0

    return-void

    .line 103
    :cond_0
    invoke-static {p1}, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;->access$000(Lcom/shopkick/app/overlays/common/ReminderSKOverlay;)V

    return-void
.end method
