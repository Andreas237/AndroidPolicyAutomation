.class public final Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView_MembersInjector;
.super Ljava/lang/Object;
.source "TeammateDetailView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;",
            ">;"
        }
    .end annotation

    .line 22
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectFormatting(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;)V
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;)V

    return-void
.end method
