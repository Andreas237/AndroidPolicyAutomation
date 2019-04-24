.class public final synthetic Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$PMd_jI6hcWDOwIKs4Lkm7TNrxyE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/views/components/ClickableViewEvent;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$PMd_jI6hcWDOwIKs4Lkm7TNrxyE;->f$0:Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;

    return-void
.end method


# virtual methods
.method public final onClick()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$PMd_jI6hcWDOwIKs4Lkm7TNrxyE;->f$0:Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->onImageButtonClicked()V

    return-void
.end method
