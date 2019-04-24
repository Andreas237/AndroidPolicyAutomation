.class Lcom/shopkick/app/bnc/LinkedCardsViewController$UnEnrollCardClickListener;
.super Ljava/lang/Object;
.source "LinkedCardsViewController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/bnc/LinkedCardsViewController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "UnEnrollCardClickListener"
.end annotation


# instance fields
.field private linkedCardsViewControllerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/bnc/LinkedCardsViewController;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V
    .locals 1

    .line 693
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 694
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$UnEnrollCardClickListener;->linkedCardsViewControllerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 699
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$UnEnrollCardClickListener;->linkedCardsViewControllerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;

    if-eqz v0, :cond_0

    .line 701
    invoke-static {v0, p1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->access$300(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/view/View;)V

    :cond_0
    return-void
.end method
