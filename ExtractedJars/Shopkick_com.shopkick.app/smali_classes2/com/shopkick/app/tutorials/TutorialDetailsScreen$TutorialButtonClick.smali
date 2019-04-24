.class Lcom/shopkick/app/tutorials/TutorialDetailsScreen$TutorialButtonClick;
.super Ljava/lang/Object;
.source "TutorialDetailsScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tutorials/TutorialDetailsScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TutorialButtonClick"
.end annotation


# instance fields
.field private tutorialDetailsRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tutorials/TutorialDetailsScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/tutorials/TutorialDetailsScreen;)V
    .locals 1

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tutorials/TutorialDetailsScreen$TutorialButtonClick;->tutorialDetailsRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 121
    iget-object p1, p0, Lcom/shopkick/app/tutorials/TutorialDetailsScreen$TutorialButtonClick;->tutorialDetailsRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;

    if-eqz p1, :cond_1

    .line 122
    invoke-static {p1}, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->access$000(Lcom/shopkick/app/tutorials/TutorialDetailsScreen;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 123
    invoke-static {p1}, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->access$100(Lcom/shopkick/app/tutorials/TutorialDetailsScreen;)I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 124
    invoke-static {p1}, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->access$100(Lcom/shopkick/app/tutorials/TutorialDetailsScreen;)I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 126
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v2, "default_tab"

    .line 127
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/HomeActivity;

    const-class v3, Lcom/shopkick/app/store/EarnScreen;

    invoke-direct {v1, v2, v3, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 130
    invoke-virtual {p1}, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    :cond_1
    return-void
.end method
