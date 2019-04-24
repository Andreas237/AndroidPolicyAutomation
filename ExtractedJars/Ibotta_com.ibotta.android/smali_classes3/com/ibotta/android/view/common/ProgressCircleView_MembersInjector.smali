.class public final Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;
.super Ljava/lang/Object;
.source "ProgressCircleView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/view/common/ProgressCircleView;",
        ">;"
    }
.end annotation


# instance fields
.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;"
        }
    .end annotation
.end field

.field private final handlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/view/common/ProgressCircleView;",
            ">;"
        }
    .end annotation

    .line 27
    new-instance v0, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectFormatting(Lcom/ibotta/android/view/common/ProgressCircleView;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method

.method public static injectHandler(Lcom/ibotta/android/view/common/ProgressCircleView;Landroid/os/Handler;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView;->handler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/view/common/ProgressCircleView;)V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;->injectFormatting(Lcom/ibotta/android/view/common/ProgressCircleView;Lcom/ibotta/android/util/Formatting;)V

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;->injectHandler(Lcom/ibotta/android/view/common/ProgressCircleView;Landroid/os/Handler;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/android/view/common/ProgressCircleView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;->injectMembers(Lcom/ibotta/android/view/common/ProgressCircleView;)V

    return-void
.end method
