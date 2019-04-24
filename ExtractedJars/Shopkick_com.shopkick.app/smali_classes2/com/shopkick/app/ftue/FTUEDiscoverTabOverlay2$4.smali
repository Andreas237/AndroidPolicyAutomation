.class Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2$4;
.super Ljava/lang/Object;
.source "FTUEDiscoverTabOverlay2.java"

# interfaces
.implements Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;


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

    .line 456
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2$4;->this$0:Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTextAnimationFinish()V
    .locals 2

    .line 459
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2$4;->this$0:Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;

    invoke-static {v0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->access$100(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    return-void
.end method
