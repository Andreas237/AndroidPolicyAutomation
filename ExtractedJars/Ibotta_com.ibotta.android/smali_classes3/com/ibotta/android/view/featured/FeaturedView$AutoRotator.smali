.class public Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;
.super Ljava/lang/Object;
.source "FeaturedView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/view/featured/FeaturedView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AutoRotator"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/view/featured/FeaturedView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/featured/FeaturedView;)V
    .locals 0

    .line 227
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;->this$0:Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;->this$0:Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-static {v0}, Lcom/ibotta/android/view/featured/FeaturedView;->access$100(Lcom/ibotta/android/view/featured/FeaturedView;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;->this$0:Lcom/ibotta/android/view/featured/FeaturedView;

    iget-object v0, v0, Lcom/ibotta/android/view/featured/FeaturedView;->vpFeature:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;

    if-eqz v0, :cond_1

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;->this$0:Lcom/ibotta/android/view/featured/FeaturedView;

    iget-object v0, v0, Lcom/ibotta/android/view/featured/FeaturedView;->vpFeature:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->getCurrentItem()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x0

    .line 235
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;->this$0:Lcom/ibotta/android/view/featured/FeaturedView;

    iget-object v2, v2, Lcom/ibotta/android/view/featured/FeaturedView;->vpFeature:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;

    invoke-virtual {v2, v0, v1}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->setCurrentItem(IZ)V

    .line 236
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView$AutoRotator;->this$0:Lcom/ibotta/android/view/featured/FeaturedView;

    iget-object v0, v0, Lcom/ibotta/android/view/featured/FeaturedView;->handler:Landroid/os/Handler;

    invoke-static {}, Lcom/ibotta/android/view/featured/FeaturedView;->access$200()J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method
