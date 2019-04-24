.class public final Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion;
.super Ljava/lang/Object;
.source "AlertMessage.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/messages/alert/AlertMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\u000c\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion;",
        "",
        "()V",
        "initAlertMessage",
        "Lcom/ibotta/android/views/messages/alert/AlertMessageContent;",
        "activity",
        "Landroid/app/Activity;",
        "initCookieBarBuilder",
        "Lorg/aviran/cookiebar2/CookieBar$Builder;",
        "alertMessageContent",
        "viewState",
        "Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;",
        "make",
        "Lcom/ibotta/android/views/messages/alert/AlertMessage;",
        "viewEvents",
        "Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion;-><init>()V

    return-void
.end method

.method private final initAlertMessage(Landroid/app/Activity;)Lcom/ibotta/android/views/messages/alert/AlertMessageContent;
    .locals 3

    const v0, 0x1020002

    .line 56
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 58
    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 59
    sget v1, Lcom/ibotta/views/R$layout;->view_message_alert:I

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type com.ibotta.android.views.messages.alert.AlertMessageContent"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final initCookieBarBuilder(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/AlertMessageContent;Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)Lorg/aviran/cookiebar2/CookieBar$Builder;
    .locals 0

    .line 67
    invoke-static {p1}, Lorg/aviran/cookiebar2/CookieBar;->build(Landroid/app/Activity;)Lorg/aviran/cookiebar2/CookieBar$Builder;

    move-result-object p1

    .line 68
    check-cast p2, Landroid/view/View;

    invoke-virtual {p1, p2}, Lorg/aviran/cookiebar2/CookieBar$Builder;->setCustomView(Landroid/view/View;)Lorg/aviran/cookiebar2/CookieBar$Builder;

    move-result-object p1

    .line 69
    invoke-virtual {p3}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;->getTitle()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/aviran/cookiebar2/CookieBar$Builder;->setTitle(Ljava/lang/String;)Lorg/aviran/cookiebar2/CookieBar$Builder;

    move-result-object p1

    .line 70
    invoke-virtual {p3}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/aviran/cookiebar2/CookieBar$Builder;->setMessage(Ljava/lang/String;)Lorg/aviran/cookiebar2/CookieBar$Builder;

    move-result-object p1

    .line 71
    invoke-virtual {p3}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;->getDuration()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lorg/aviran/cookiebar2/CookieBar$Builder;->setDuration(J)Lorg/aviran/cookiebar2/CookieBar$Builder;

    move-result-object p1

    .line 72
    sget p2, Lcom/ibotta/views/R$color;->gray_30:I

    invoke-virtual {p1, p2}, Lorg/aviran/cookiebar2/CookieBar$Builder;->setTitleColor(I)Lorg/aviran/cookiebar2/CookieBar$Builder;

    move-result-object p1

    .line 73
    sget p2, Lcom/ibotta/views/R$color;->blowhole_green:I

    invoke-virtual {p1, p2}, Lorg/aviran/cookiebar2/CookieBar$Builder;->setActionColor(I)Lorg/aviran/cookiebar2/CookieBar$Builder;

    move-result-object p1

    .line 74
    sget p2, Lcom/ibotta/views/R$color;->gray_66:I

    invoke-virtual {p1, p2}, Lorg/aviran/cookiebar2/CookieBar$Builder;->setMessageColor(I)Lorg/aviran/cookiebar2/CookieBar$Builder;

    move-result-object p1

    .line 75
    sget p2, Lcom/ibotta/views/R$color;->white:I

    invoke-virtual {p1, p2}, Lorg/aviran/cookiebar2/CookieBar$Builder;->setBackgroundColor(I)Lorg/aviran/cookiebar2/CookieBar$Builder;

    move-result-object p1

    const-string p2, ""

    .line 77
    sget-object p3, Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion$initCookieBarBuilder$1;->INSTANCE:Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion$initCookieBarBuilder$1;

    check-cast p3, Lorg/aviran/cookiebar2/OnActionClickListener;

    invoke-virtual {p1, p2, p3}, Lorg/aviran/cookiebar2/CookieBar$Builder;->setAction(Ljava/lang/String;Lorg/aviran/cookiebar2/OnActionClickListener;)Lorg/aviran/cookiebar2/CookieBar$Builder;

    move-result-object p1

    const-string p2, "CookieBar.build(activity\u2026       .setAction(\"\") { }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;)Lcom/ibotta/android/views/messages/alert/AlertMessage;
    .locals 4
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewEvents"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion;

    invoke-direct {v0, p1}, Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion;->initAlertMessage(Landroid/app/Activity;)Lcom/ibotta/android/views/messages/alert/AlertMessageContent;

    move-result-object v1

    .line 45
    invoke-direct {v0, p1, v1, p2}, Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion;->initCookieBarBuilder(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/AlertMessageContent;Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)Lorg/aviran/cookiebar2/CookieBar$Builder;

    move-result-object v0

    .line 46
    new-instance v2, Lcom/ibotta/android/views/messages/alert/AlertMessage;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v1, v0, v3}, Lcom/ibotta/android/views/messages/alert/AlertMessage;-><init>(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/AlertMessageContent;Lorg/aviran/cookiebar2/CookieBar$Builder;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    invoke-virtual {v1, v2}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->setAlertMessage(Lcom/ibotta/android/views/messages/alert/AlertMessage;)V

    .line 49
    invoke-virtual {v1, p2}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->updateViewState(Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)V

    .line 50
    invoke-virtual {v1, p3}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->bindViewEvents(Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;)V

    return-object v2
.end method
