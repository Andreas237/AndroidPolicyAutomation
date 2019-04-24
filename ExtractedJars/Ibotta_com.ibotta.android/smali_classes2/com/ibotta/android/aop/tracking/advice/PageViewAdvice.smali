.class public Lcom/ibotta/android/aop/tracking/advice/PageViewAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "PageViewAdvice.java"


# static fields
.field private static final KEY_RETAILER_ID:Ljava/lang/String; = "retailer_id"


# instance fields
.field private final screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    .line 31
    iput-object p4, p0, Lcom/ibotta/android/aop/tracking/advice/PageViewAdvice;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    return-void
.end method

.method private findRetailerId(Landroid/content/Intent;)Ljava/lang/Integer;
    .locals 4
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const-string v1, "retailer_id"

    .line 68
    invoke-virtual {p1, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "retailer_id"

    const/4 v1, 0x0

    .line 69
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 71
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 72
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz v3, :cond_2

    .line 73
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_3
    :goto_0
    return-object v0
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 3

    .line 36
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    check-cast p1, Landroid/support/v4/app/FragmentActivity;

    .line 38
    instance-of v0, p1, Lcom/ibotta/android/mvp/base/MvpActivity;

    if-nez v0, :cond_0

    return-void

    .line 42
    :cond_0
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->nativeScreenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    .line 44
    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/PageViewAdvice;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->getScreenName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->screenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    .line 46
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/PageViewAdvice;->findRetailerId(Landroid/content/Intent;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 48
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    :cond_1
    const-string p1, "view_page"

    .line 51
    invoke-virtual {v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/aop/tracking/advice/PageViewAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
