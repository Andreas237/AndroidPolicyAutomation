.class public Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "UpdateProfileModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;",
        ">;"
    }
.end annotation


# instance fields
.field private final updateProfileActivity:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;->updateProfileActivity:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/util/Validation;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;
    .locals 8
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 40
    new-instance v7, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/util/Validation;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    return-object v7
.end method

.method public providePasswordPrompterFactory(Lcom/ibotta/android/security/PasswordCache;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;
    .locals 2
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 46
    new-instance v0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactoryImpl;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;->updateProfileActivity:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

    invoke-direct {v0, v1, p1, p2}, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactoryImpl;-><init>(Lcom/ibotta/android/activity/CompatSupplier;Lcom/ibotta/android/security/PasswordCache;Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method
