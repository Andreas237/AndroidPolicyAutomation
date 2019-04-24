.class Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2$1;
.super Ljava/lang/Object;
.source "FTUEDiscoverTabOverlay2.java"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;


# direct methods
.method constructor <init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2$1;->this$0:Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 154
    iget-object p2, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2$1;->this$0:Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;

    invoke-static {p2}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->access$000(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)Lcom/shopkick/app/ftue/DragConstraintLayout;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/ftue/DragConstraintLayout;->isMoving()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 155
    invoke-virtual {p1, p7}, Landroid/view/View;->setTop(I)V

    .line 156
    invoke-virtual {p1, p9}, Landroid/view/View;->setBottom(I)V

    .line 157
    invoke-virtual {p1, p6}, Landroid/view/View;->setLeft(I)V

    .line 158
    invoke-virtual {p1, p8}, Landroid/view/View;->setRight(I)V

    :cond_0
    return-void
.end method
