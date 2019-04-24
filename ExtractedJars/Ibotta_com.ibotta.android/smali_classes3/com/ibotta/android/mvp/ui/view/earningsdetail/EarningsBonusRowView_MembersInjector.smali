.class public final Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_MembersInjector;
.super Ljava/lang/Object;
.source "EarningsBonusRowView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;",
        ">;"
    }
.end annotation


# instance fields
.field private final bonusHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/bonus/BonusHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
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
            "Lcom/ibotta/api/helper/bonus/BonusHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_MembersInjector;->bonusHelperProvider:Ljavax/inject/Provider;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/bonus/BonusHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;",
            ">;"
        }
    .end annotation

    .line 27
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectBonusHelper(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;Lcom/ibotta/api/helper/bonus/BonusHelper;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    return-void
.end method

.method public static injectFormatting(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;)V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_MembersInjector;->bonusHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/bonus/BonusHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_MembersInjector;->injectBonusHelper(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;Lcom/ibotta/api/helper/bonus/BonusHelper;)V

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;)V

    return-void
.end method
