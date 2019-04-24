.class Lcom/shopkick/app/bnc/GenericCardLinkingScreen$ActionButtonClickListener;
.super Ljava/lang/Object;
.source "GenericCardLinkingScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/bnc/GenericCardLinkingScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ActionButtonClickListener"
.end annotation


# instance fields
.field private screenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/bnc/GenericCardLinkingScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/bnc/GenericCardLinkingScreen;)V
    .locals 1

    .line 251
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 252
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen$ActionButtonClickListener;->screenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 257
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen$ActionButtonClickListener;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;

    if-eqz p1, :cond_0

    .line 259
    invoke-static {p1}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->access$000(Lcom/shopkick/app/bnc/GenericCardLinkingScreen;)V

    :cond_0
    return-void
.end method
