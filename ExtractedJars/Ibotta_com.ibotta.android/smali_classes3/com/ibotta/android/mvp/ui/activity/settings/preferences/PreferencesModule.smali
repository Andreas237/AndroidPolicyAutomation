.class public Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "PreferencesModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;",
        ">;"
    }
.end annotation


# instance fields
.field private final preferencesActivity:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesModule;->preferencesActivity:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;

    return-void
.end method

.method public static providePreferencesReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/account/settings/PreferencesReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/account/settings/PreferencesReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/account/settings/PreferencesReducer;-><init>(Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v0
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/app/fcm/FcmState;Lcom/ibotta/android/account/settings/PreferencesReducer;)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenter;
    .locals 7
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 44
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/app/fcm/FcmState;Lcom/ibotta/android/account/settings/PreferencesReducer;)V

    return-object v6
.end method

.method public providePasswordPrompterFactory(Lcom/ibotta/android/security/PasswordCache;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;
    .locals 2
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 49
    new-instance v0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactoryImpl;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesModule;->preferencesActivity:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;

    invoke-direct {v0, v1, p1, p2}, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactoryImpl;-><init>(Lcom/ibotta/android/activity/CompatSupplier;Lcom/ibotta/android/security/PasswordCache;Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method
