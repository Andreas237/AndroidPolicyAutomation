.class Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$LaunchExternalLinkClick;
.super Ljava/lang/Object;
.source "RedeemedRewardDetailsScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LaunchExternalLinkClick"
.end annotation


# instance fields
.field private screenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;",
            ">;"
        }
    .end annotation
.end field

.field private url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;Ljava/lang/String;)V
    .locals 1

    .line 559
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 560
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$LaunchExternalLinkClick;->screenRef:Ljava/lang/ref/WeakReference;

    .line 561
    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$LaunchExternalLinkClick;->url:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 566
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$LaunchExternalLinkClick;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;

    if-nez p1, :cond_0

    return-void

    .line 568
    :cond_0
    invoke-static {p1}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->access$300(Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$LaunchExternalLinkClick;->url:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method
