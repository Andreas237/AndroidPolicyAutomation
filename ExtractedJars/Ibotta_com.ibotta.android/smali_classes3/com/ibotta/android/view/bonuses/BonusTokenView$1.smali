.class Lcom/ibotta/android/view/bonuses/BonusTokenView$1;
.super Ljava/lang/Object;
.source "BonusTokenView.java"

# interfaces
.implements Lcom/ibotta/android/images/ImageCacheListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/view/bonuses/BonusTokenView;->onProgressSet()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/view/bonuses/BonusTokenView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/view/bonuses/BonusTokenView;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView$1;->this$0:Lcom/ibotta/android/view/bonuses/BonusTokenView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView$1;->this$0:Lcom/ibotta/android/view/bonuses/BonusTokenView;

    invoke-static {v0}, Lcom/ibotta/android/view/bonuses/BonusTokenView;->access$000(Lcom/ibotta/android/view/bonuses/BonusTokenView;)V

    return-void
.end method

.method public onSuccess(II)V
    .locals 0

    .line 105
    iget-object p1, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView$1;->this$0:Lcom/ibotta/android/view/bonuses/BonusTokenView;

    invoke-static {p1}, Lcom/ibotta/android/view/bonuses/BonusTokenView;->access$000(Lcom/ibotta/android/view/bonuses/BonusTokenView;)V

    return-void
.end method
