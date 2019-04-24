.class Lcom/shopkick/app/tutorials/TutorialHomeScreen$TutorialButtonClick;
.super Ljava/lang/Object;
.source "TutorialHomeScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tutorials/TutorialHomeScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TutorialButtonClick"
.end annotation


# instance fields
.field private tutorialHomeRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tutorials/TutorialHomeScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/tutorials/TutorialHomeScreen;)V
    .locals 1

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tutorials/TutorialHomeScreen$TutorialButtonClick;->tutorialHomeRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/tutorials/TutorialHomeScreen$TutorialButtonClick;->tutorialHomeRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tutorials/TutorialHomeScreen;

    if-eqz v0, :cond_4

    const-string/jumbo v1, "tutorial_details_screen_id"

    .line 103
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 105
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v3, 0x7f0907b4

    if-eq p1, v3, :cond_3

    const v3, 0x7f0907b6

    const/4 v4, 0x0

    if-eq p1, v3, :cond_2

    const v3, 0x7f0907b8

    if-eq p1, v3, :cond_1

    const v1, 0x7f0907ba

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 107
    :cond_0
    const-class p1, Lcom/shopkick/app/kickstarter/HowToWalkInScreen;

    invoke-virtual {v0, p1, v4}, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 110
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    const-class p1, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;

    invoke-virtual {v0, p1, v2}, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 114
    :cond_2
    const-class p1, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;

    invoke-virtual {v0, p1, v4}, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 117
    :cond_3
    invoke-static {v0}, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->access$000(Lcom/shopkick/app/tutorials/TutorialHomeScreen;)V

    :cond_4
    :goto_0
    return-void
.end method
