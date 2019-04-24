.class public final Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView_MembersInjector;
.super Ljava/lang/Object;
.source "QuestionEngagementView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;",
        ">;"
    }
.end annotation


# instance fields
.field private final gameQuestionDriverFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final optionHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OptionHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final pixelTrackingManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OptionHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView_MembersInjector;->pixelTrackingManagerProvider:Ljavax/inject/Provider;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView_MembersInjector;->optionHelperProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView_MembersInjector;->gameQuestionDriverFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OptionHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;",
            ">;"
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView_MembersInjector;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectGameQuestionDriverFactory(Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->gameQuestionDriverFactory:Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;

    return-void
.end method

.method public static injectOptionHelper(Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;Lcom/ibotta/api/helper/offer/OptionHelper;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->optionHelper:Lcom/ibotta/api/helper/offer/OptionHelper;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView_MembersInjector;->pixelTrackingManagerProvider:Ljavax/inject/Provider;

    .line 42
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    .line 41
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView_MembersInjector;->injectPixelTrackingManager(Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView_MembersInjector;->optionHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OptionHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView_MembersInjector;->injectOptionHelper(Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;Lcom/ibotta/api/helper/offer/OptionHelper;)V

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView_MembersInjector;->gameQuestionDriverFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView_MembersInjector;->injectGameQuestionDriverFactory(Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;)V

    return-void
.end method
