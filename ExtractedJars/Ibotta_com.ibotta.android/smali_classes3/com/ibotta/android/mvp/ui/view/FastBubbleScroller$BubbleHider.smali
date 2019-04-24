.class Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;
.super Ljava/lang/Object;
.source "FastBubbleScroller.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "BubbleHider"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;->this$0:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$1;)V
    .locals 0

    .line 229
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;-><init>(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;->this$0:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->access$200(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;)V

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;->this$0:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->access$302(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;Z)Z

    return-void
.end method
