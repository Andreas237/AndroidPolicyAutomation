.class public final Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "FirstUsePromoCodeScreen.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/text/TextWatcher;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirstUsePromoCodeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirstUsePromoCodeScreen.kt\ncom/shopkick/app/launch/FirstUsePromoCodeScreen\n*L\n1#1,355:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001XB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u0007H\u0002J\u0012\u0010(\u001a\u00020)2\u0008\u0010*\u001a\u0004\u0018\u00010+H\u0016J*\u0010,\u001a\u00020)2\u0008\u0010*\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020%H\u0016J\u0008\u00101\u001a\u00020)H\u0002J\u001c\u00102\u001a\u00020)2\u0008\u00103\u001a\u0004\u0018\u0001042\u0008\u00105\u001a\u0004\u0018\u000106H\u0016J$\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u0002092\u0008\u0010:\u001a\u0004\u0018\u00010;2\u0008\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0012\u0010>\u001a\u00020)2\u0008\u0010?\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010@\u001a\u00020)2\u0008\u0010?\u001a\u0004\u0018\u00010\u0014H\u0002J(\u0010A\u001a\u00020)2\u0008\u0010B\u001a\u0004\u0018\u00010C2\u0014\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c\u0018\u00010EH\u0016J\u0012\u0010F\u001a\u00020)2\u0008\u0010?\u001a\u0004\u0018\u00010\u0014H\u0016J\u0008\u0010G\u001a\u00020)H\u0016J\u0008\u0010H\u001a\u00020)H\u0014J*\u0010I\u001a\u00020)2\u0008\u0010*\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020%2\u0006\u0010J\u001a\u00020%2\u0006\u0010/\u001a\u00020%H\u0016J\u001c\u0010K\u001a\u00020)2\u0008\u00103\u001a\u0004\u0018\u0001042\u0008\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u0010L\u001a\u00020)2\u0008\u0010M\u001a\u0004\u0018\u00010\u000cH\u0002J\u0008\u0010N\u001a\u00020)H\u0002J\u0008\u0010O\u001a\u00020)H\u0002J\u0008\u0010P\u001a\u00020QH\u0016J\u0008\u0010R\u001a\u00020QH\u0016J\u0008\u0010S\u001a\u00020)H\u0002J\u0010\u0010T\u001a\u00020)2\u0006\u0010U\u001a\u00020VH\u0016J\u0008\u0010W\u001a\u00020)H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006Y"
    }
    d2 = {
        "Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;",
        "Lcom/shopkick/app/screens/AppScreen;",
        "Landroid/view/View$OnClickListener;",
        "Landroid/text/TextWatcher;",
        "Lcom/shopkick/fetchers/api/IAPICallback;",
        "()V",
        "ALPHA_DISABLED",
        "",
        "ANIMATION_DURATION",
        "",
        "DELAY_AFTER_APPLIED",
        "MESSAGE_TO_AVOID",
        "",
        "apiManager",
        "Lcom/shopkick/fetchers/api/APIManager;",
        "buttonUrl",
        "nextButton",
        "Lcom/shopkick/app/widget/SKButton;",
        "prevErrorMessage",
        "progressBar",
        "Landroid/view/View;",
        "promoCodeInputLayout",
        "Landroid/support/design/widget/TextInputLayout;",
        "promoCodeText",
        "Landroid/widget/EditText;",
        "redeemMarketingPromoCodeRequest",
        "Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;",
        "redeemPromoCodeRequest",
        "Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;",
        "requestState",
        "Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;",
        "skipButton",
        "userAccountDataSource",
        "Lcom/shopkick/app/account/UserAccountDataSource;",
        "verificationIcon",
        "Landroid/widget/ImageView;",
        "adjustAlpha",
        "",
        "color",
        "factor",
        "afterTextChanged",
        "",
        "s",
        "Landroid/text/Editable;",
        "beforeTextChanged",
        "",
        "start",
        "count",
        "after",
        "cancelAllRequests",
        "completedResponse",
        "request",
        "Lcom/shopkick/app/fetchers/api/IAPIObject;",
        "response",
        "Lcom/shopkick/fetchers/DataResponse;",
        "createScreen",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "disableView",
        "view",
        "enableView",
        "init",
        "screenGlobals",
        "Lcom/shopkick/app/application/ScreenGlobals;",
        "params",
        "",
        "onClick",
        "onDestroy",
        "onScreenDidShow",
        "onTextChanged",
        "before",
        "receivedResponse",
        "setCodeAppliedErrorState",
        "errorMessage",
        "setCodeAppliedState",
        "setupLogging",
        "shouldDisplayAppScreenHeader",
        "",
        "shouldHideBack",
        "triggerNextScreen",
        "updateScreenParams",
        "clientLogRecordToUpdate",
        "Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;",
        "validatePromoCode",
        "RequestState",
        "Shopkick_defaultFlavorRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final ALPHA_DISABLED:F

.field private final ANIMATION_DURATION:J

.field private final DELAY_AFTER_APPLIED:J

.field private final MESSAGE_TO_AVOID:Ljava/lang/String;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private buttonUrl:Ljava/lang/String;

.field private nextButton:Lcom/shopkick/app/widget/SKButton;

.field private prevErrorMessage:Ljava/lang/String;

.field private progressBar:Landroid/view/View;

.field private promoCodeInputLayout:Landroid/support/design/widget/TextInputLayout;

.field private promoCodeText:Landroid/widget/EditText;

.field private redeemMarketingPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;

.field private redeemPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;

.field private requestState:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;

.field private skipButton:Lcom/shopkick/app/widget/SKButton;

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

.field private verificationIcon:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const-wide/16 v0, 0xc8

    .line 33
    iput-wide v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->ANIMATION_DURATION:J

    const v0, 0x3ecccccd    # 0.4f

    .line 34
    iput v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->ALPHA_DISABLED:F

    const-wide/16 v0, 0x3e8

    .line 35
    iput-wide v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->DELAY_AFTER_APPLIED:J

    const-string v0, "Something"

    .line 36
    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->MESSAGE_TO_AVOID:Ljava/lang/String;

    .line 59
    sget-object v0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;->INITIAL_STATE:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->requestState:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;

    return-void
.end method

.method public static final synthetic access$adjustAlpha(Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;IF)I
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->adjustAlpha(IF)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getNextButton$p(Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method public static final synthetic access$setNextButton$p(Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;Lcom/shopkick/app/widget/SKButton;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    return-void
.end method

.method public static final synthetic access$triggerNextScreen(Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->triggerNextScreen()V

    return-void
.end method

.method private final adjustAlpha(IF)I
    .locals 2

    .line 240
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p2

    .line 241
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    .line 242
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    .line 243
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    .line 244
    invoke-static {p2, v0, v1, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1
.end method

.method private final cancelAllRequests()V
    .locals 3

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->redeemMarketingPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;

    if-eqz v0, :cond_0

    .line 157
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-object v2, p0

    check-cast v2, Lcom/shopkick/fetchers/api/IAPICallback;

    invoke-virtual {v1, v0, v2}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 160
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->redeemPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;

    if-eqz v0, :cond_1

    .line 161
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-object v2, p0

    check-cast v2, Lcom/shopkick/fetchers/api/IAPICallback;

    invoke-virtual {v1, v0, v2}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    :cond_1
    const/4 v0, 0x0

    .line 164
    move-object v1, v0

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;

    iput-object v1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->redeemMarketingPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;

    .line 165
    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->redeemPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;

    .line 167
    sget-object v0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;->INITIAL_STATE:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->requestState:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;

    return-void
.end method

.method private final disableView(Landroid/view/View;)V
    .locals 2

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 254
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    :cond_0
    if-eqz p1, :cond_1

    .line 255
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    :cond_1
    if-eqz p1, :cond_2

    .line 256
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    if-eqz p1, :cond_2

    iget v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->ALPHA_DISABLED:F

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-wide v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->ANIMATION_DURATION:J

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    :cond_2
    return-void
.end method

.method private final enableView(Landroid/view/View;)V
    .locals 2

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 248
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    :cond_0
    if-eqz p1, :cond_1

    .line 249
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    :cond_1
    if-eqz p1, :cond_2

    .line 250
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    if-eqz p1, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-wide v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->ANIMATION_DURATION:J

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    :cond_2
    return-void
.end method

.method private final setCodeAppliedErrorState(Ljava/lang/String;)V
    .locals 5

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->prevErrorMessage:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/CharSequence;

    iget-object v3, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->MESSAGE_TO_AVOID:Ljava/lang/String;

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x2

    invoke-static {v0, v3, v1, v4, v2}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    .line 204
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->prevErrorMessage:Ljava/lang/String;

    .line 208
    :cond_1
    check-cast v2, Ljava/lang/String;

    iput-object v2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->prevErrorMessage:Ljava/lang/String;

    .line 209
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->cancelAllRequests()V

    .line 211
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeText:Landroid/widget/EditText;

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 212
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeText:Landroid/widget/EditText;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 213
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeInputLayout:Landroid/support/design/widget/TextInputLayout;

    if-eqz v0, :cond_5

    if-eqz p1, :cond_4

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_4
    return-void

    .line 214
    :cond_5
    :goto_1
    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->showKeyboard()V

    .line 216
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz p1, :cond_6

    const v0, 0x7f1102e4

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 217
    :cond_6
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    check-cast p1, Landroid/view/View;

    invoke-direct {p0, p1}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->disableView(Landroid/view/View;)V

    .line 218
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->skipButton:Lcom/shopkick/app/widget/SKButton;

    check-cast p1, Landroid/view/View;

    invoke-direct {p0, p1}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->enableView(Landroid/view/View;)V

    .line 220
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->verificationIcon:Landroid/widget/ImageView;

    if-eqz p1, :cond_7

    const v0, 0x7f08015e

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 221
    :cond_7
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->verificationIcon:Landroid/widget/ImageView;

    if-eqz p1, :cond_8

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 223
    :cond_8
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->progressBar:Landroid/view/View;

    if-eqz p1, :cond_9

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    return-void
.end method

.method private final setCodeAppliedState()V
    .locals 7

    .line 172
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->cancelAllRequests()V

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKButton;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 176
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz v1, :cond_0

    const v2, 0x7f06015d

    invoke-virtual {v0, v2}, Landroid/content/Context;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonTextColor(I)V

    .line 177
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz v0, :cond_1

    const v1, 0x7f1102e5

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 178
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 180
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->skipButton:Lcom/shopkick/app/widget/SKButton;

    check-cast v0, Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->disableView(Landroid/view/View;)V

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->verificationIcon:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    const v2, 0x7f08015d

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 183
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->verificationIcon:Landroid/widget/ImageView;

    if-eqz v0, :cond_4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 185
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->progressBar:Landroid/view/View;

    if-eqz v0, :cond_5

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_5
    const v0, 0x7f0600ce

    .line 188
    invoke-virtual {p0, v0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->getResourceColor(I)I

    move-result v0

    const/4 v1, 0x2

    .line 189
    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ObjectAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 190
    new-instance v2, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$setCodeAppliedState$1;

    invoke-direct {v2, p0, v0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$setCodeAppliedState$1;-><init>(Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;I)V

    check-cast v2, Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-string v0, "buttonColorAnimator"

    .line 194
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->ANIMATION_DURATION:J

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 195
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz v0, :cond_6

    new-instance v1, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$setCodeAppliedState$2;

    move-object v2, p0

    check-cast v2, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;

    invoke-direct {v1, v2}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$setCodeAppliedState$2;-><init>(Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    new-instance v2, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$sam$java_lang_Runnable$0;

    invoke-direct {v2, v1}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$sam$java_lang_Runnable$0;-><init>(Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Ljava/lang/Runnable;

    iget-wide v3, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->ANIMATION_DURATION:J

    iget-wide v5, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->DELAY_AFTER_APPLIED:J

    add-long/2addr v3, v5

    invoke-virtual {v0, v2, v3, v4}, Lcom/shopkick/app/widget/SKButton;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_6
    return-void

    :cond_7
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private final setupLogging()V
    .locals 6

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    const/4 v2, 0x4

    if-eqz v0, :cond_0

    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v4, 0x1d

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    iget-object v4, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v3, v4, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->skipButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz v0, :cond_1

    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v4, 0x20

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v3, v2, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    :cond_1
    return-void
.end method

.method private final triggerNextScreen()V
    .locals 2

    .line 227
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->cancelAllRequests()V

    .line 228
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->buttonUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 229
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v1

    .line 230
    invoke-virtual {v1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    goto :goto_0

    .line 231
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->popScreen()V

    :goto_0
    return-void
.end method

.method private final validatePromoCode()V
    .locals 5

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeText:Landroid/widget/EditText;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 135
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-void

    .line 137
    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeText:Landroid/widget/EditText;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 138
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeText:Landroid/widget/EditText;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/widget/EditText;->clearFocus()V

    .line 139
    :cond_3
    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->hideKeyboard()V

    .line 141
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->cancelAllRequests()V

    .line 143
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeText:Landroid/widget/EditText;

    if-eqz v2, :cond_4

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 144
    :cond_4
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeInputLayout:Landroid/support/design/widget/TextInputLayout;

    if-eqz v2, :cond_5

    move-object v4, v1

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v2, v4}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 146
    :cond_5
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->progressBar:Landroid/view/View;

    if-eqz v2, :cond_6

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 147
    :cond_6
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz v2, :cond_7

    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 148
    :cond_7
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz v2, :cond_8

    invoke-virtual {v2, v3}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 150
    :cond_8
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    if-eqz v2, :cond_9

    move-object v3, p0

    check-cast v3, Lcom/shopkick/fetchers/api/IAPICallback;

    invoke-virtual {v2, v0, v3}, Lcom/shopkick/app/account/UserAccountDataSource;->makeRedeemPromoCodeRequest(Ljava/lang/String;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;

    move-result-object v2

    goto :goto_1

    :cond_9
    move-object v2, v1

    :goto_1
    iput-object v2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->redeemPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;

    .line 151
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    if-eqz v2, :cond_a

    move-object v1, p0

    check-cast v1, Lcom/shopkick/fetchers/api/IAPICallback;

    invoke-virtual {v2, v0, v1}, Lcom/shopkick/app/account/UserAccountDataSource;->makeRedeemMarketingPromoCodeRequest(Ljava/lang/String;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;

    move-result-object v1

    :cond_a
    iput-object v1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->redeemMarketingPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;

    return-void

    .line 134
    :cond_b
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type kotlin.CharSequence"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1
    .param p1    # Landroid/text/Editable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 285
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeText:Landroid/widget/EditText;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 288
    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 289
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    check-cast p1, Landroid/view/View;

    invoke-direct {p0, p1}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->disableView(Landroid/view/View;)V

    goto :goto_1

    .line 291
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    check-cast p1, Landroid/view/View;

    invoke-direct {p0, p1}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->enableView(Landroid/view/View;)V

    .line 295
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->skipButton:Lcom/shopkick/app/widget/SKButton;

    check-cast p1, Landroid/view/View;

    invoke-direct {p0, p1}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->enableView(Landroid/view/View;)V

    .line 296
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeInputLayout:Landroid/support/design/widget/TextInputLayout;

    if-eqz p1, :cond_2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 297
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->verificationIcon:Landroid/widget/ImageView;

    if-eqz p1, :cond_3

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 5
    .param p1    # Lcom/shopkick/app/fetchers/api/IAPIObject;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/shopkick/fetchers/DataResponse;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 311
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->requestState:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;

    sget-object v0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;->REQUEST_SUCCEEDED:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;

    if-ne p1, v0, :cond_0

    return-void

    .line 313
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKButton;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_11

    const/4 v0, 0x0

    .line 314
    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    const v2, 0x7f110359

    if-eqz p2, :cond_1

    .line 316
    iget-boolean v3, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v3, :cond_3

    :cond_1
    if-eqz p2, :cond_2

    iget-object v3, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    goto :goto_0

    :cond_2
    move-object v3, v0

    :goto_0
    if-nez v3, :cond_7

    :cond_3
    if-eqz p2, :cond_4

    .line 318
    iget p2, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_1

    :cond_4
    move-object p2, v0

    :goto_1
    const/4 v1, 0x2

    if-nez p2, :cond_5

    goto :goto_2

    .line 319
    :cond_5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ne p2, v1, :cond_6

    if-eqz p1, :cond_10

    const p2, 0x7f110557

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_5

    :cond_6
    :goto_2
    if-eqz p1, :cond_10

    .line 320
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    .line 325
    :cond_7
    iget-object v3, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    .line 326
    instance-of v4, v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeResponse;

    if-eqz v4, :cond_b

    .line 327
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_a

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeResponse;

    .line 328
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeResponse;->redemptionStatus:Ljava/lang/Integer;

    if-nez p2, :cond_8

    goto :goto_3

    .line 329
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-nez p2, :cond_9

    sget-object p1, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;->REQUEST_SUCCEEDED:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->requestState:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;

    move-object v0, v1

    goto :goto_5

    .line 330
    :cond_9
    :goto_3
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeResponse;->errorMessage:Ljava/lang/String;

    move-object v0, v1

    goto :goto_5

    .line 327
    :cond_a
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type com.shopkick.app.fetchers.api.skapi.RedeemPromoCodeResponse"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 334
    :cond_b
    instance-of v3, v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeResponse;

    if-eqz v3, :cond_f

    .line 335
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_e

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeResponse;

    .line 336
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeResponse;->redemptionStatus:Ljava/lang/Integer;

    if-nez p2, :cond_c

    goto :goto_4

    .line 337
    :cond_c
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-nez p2, :cond_d

    sget-object p1, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;->REQUEST_SUCCEEDED:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->requestState:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;

    move-object v0, v1

    goto :goto_5

    .line 338
    :cond_d
    :goto_4
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeResponse;->errorMessage:Ljava/lang/String;

    move-object v0, v1

    goto :goto_5

    .line 335
    :cond_e
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type com.shopkick.app.fetchers.api.skapi.RedeemMarketingPromoCodeResponse"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    if-eqz p1, :cond_10

    .line 342
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 346
    :cond_10
    :goto_5
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->requestState:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;

    sget-object p2, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;->ordinal()I

    move-result p1

    aget p1, p2, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_6

    .line 350
    :pswitch_0
    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->prevErrorMessage:Ljava/lang/String;

    .line 351
    sget-object p1, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;->ONE_REQUEST_FAILED:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->requestState:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$RequestState;

    goto :goto_6

    .line 348
    :pswitch_1
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->setCodeAppliedState()V

    goto :goto_6

    .line 347
    :pswitch_2
    invoke-direct {p0, v0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->setCodeAppliedErrorState(Ljava/lang/String;)V

    :goto_6
    return-void

    :cond_11
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    const v0, 0x7f0c00c0

    .line 83
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f09055d

    .line 85
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeText:Landroid/widget/EditText;

    const p2, 0x7f090555

    .line 86
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/support/design/widget/TextInputLayout;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeInputLayout:Landroid/support/design/widget/TextInputLayout;

    const p2, 0x7f0907f1

    .line 87
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->verificationIcon:Landroid/widget/ImageView;

    const p2, 0x7f090434

    .line 88
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->progressBar:Landroid/view/View;

    const p2, 0x7f0904a8

    .line 89
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const p2, 0x7f0906a5

    .line 90
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->skipButton:Lcom/shopkick/app/widget/SKButton;

    .line 92
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeText:Landroid/widget/EditText;

    if-eqz p2, :cond_0

    move-object v0, p0

    check-cast v0, Landroid/text/TextWatcher;

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 93
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz p2, :cond_1

    move-object v0, p0

    check-cast v0, Landroid/view/View$OnClickListener;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->skipButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz p2, :cond_2

    move-object v0, p0

    check-cast v0, Landroid/view/View$OnClickListener;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->setupLogging()V

    .line 99
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz p2, :cond_3

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 100
    :cond_3
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz p2, :cond_4

    iget p3, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->ALPHA_DISABLED:F

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setAlpha(F)V

    :cond_4
    const-string/jumbo p2, "view"

    .line 102
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 2
    .param p1    # Lcom/shopkick/app/application/ScreenGlobals;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 67
    iget-object v1, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    iput-object v1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    if-eqz p1, :cond_1

    .line 68
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    if-eqz p2, :cond_2

    const-string p1, "button_url"

    .line 69
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    :cond_2
    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->buttonUrl:Ljava/lang/String;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 265
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const v0, 0x7f0904a8

    if-nez p1, :cond_1

    goto :goto_1

    .line 266
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_2

    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->validatePromoCode()V

    goto :goto_2

    :cond_2
    :goto_1
    const v0, 0x7f0906a5

    if-nez p1, :cond_3

    goto :goto_2

    .line 267
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v0, :cond_4

    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->triggerNextScreen()V

    :cond_4
    :goto_2
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 114
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    .line 115
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->cancelAllRequests()V

    return-void
.end method

.method protected onScreenDidShow()V
    .locals 2

    .line 119
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeText:Landroid/widget/EditText;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->promoCodeText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 123
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->showKeyboard()V

    :cond_1
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0
    .param p1    # Lcom/shopkick/app/fetchers/api/IAPIObject;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/shopkick/fetchers/DataResponse;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2
    .param p1    # Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "clientLogRecordToUpdate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->params:Ljava/util/Map;

    const-string v1, "flow_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 77
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 78
    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
