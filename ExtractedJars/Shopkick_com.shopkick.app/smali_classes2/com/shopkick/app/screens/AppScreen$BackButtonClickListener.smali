.class public Lcom/shopkick/app/screens/AppScreen$BackButtonClickListener;
.super Ljava/lang/Object;
.source "AppScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/screens/AppScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BackButtonClickListener"
.end annotation


# instance fields
.field private screenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/screens/AppScreen;)V
    .locals 1

    .line 530
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 531
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/screens/AppScreen$BackButtonClickListener;->screenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 536
    iget-object p1, p0, Lcom/shopkick/app/screens/AppScreen$BackButtonClickListener;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-eqz p1, :cond_0

    .line 538
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->popScreen()V

    :cond_0
    return-void
.end method
