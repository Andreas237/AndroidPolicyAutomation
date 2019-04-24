.class public final synthetic Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;->f$0:Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;

    return-void
.end method


# virtual methods
.method public final onOverlayDismiss()V
    .locals 1

    iget-object v0, p0, Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;->f$0:Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/SKOverlay;->dismiss()V

    return-void
.end method
