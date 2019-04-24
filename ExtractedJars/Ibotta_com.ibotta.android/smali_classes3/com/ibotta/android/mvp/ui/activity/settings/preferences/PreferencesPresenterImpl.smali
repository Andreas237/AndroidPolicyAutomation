.class public Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractPasswordUsingMvpPresenter;
.source "PreferencesPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractPasswordUsingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenter;"
    }
.end annotation


# static fields
.field private static final KEY_PUSH_LOCATION:Ljava/lang/String; = "push_location"

.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field protected customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private email:Ljava/lang/String;

.field private final fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

.field private preferencesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final preferencesReducer:Lcom/ibotta/android/account/settings/PreferencesReducer;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;",
            ">;"
        }
    .end annotation
.end field

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/app/fcm/FcmState;Lcom/ibotta/android/account/settings/PreferencesReducer;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractPasswordUsingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 48
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->rows:Ljava/util/List;

    .line 59
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 60
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 61
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    .line 62
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->preferencesReducer:Lcom/ibotta/android/account/settings/PreferencesReducer;

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "PreferencesPresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "updatePreferenceState"

    const-string v3, "com.ibotta.android.mvp.ui.activity.settings.preferences.PreferencesPresenterImpl"

    const-string v4, "com.ibotta.android.mvp.ui.activity.settings.preferences.Preference:boolean"

    const-string v5, "oldPreference:isChecked"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x88

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private generateLocalPreferences()V
    .locals 4

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->rows:Ljava/util/List;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceHeaderRow;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->preferencesReducer:Lcom/ibotta/android/account/settings/PreferencesReducer;

    invoke-virtual {v2}, Lcom/ibotta/android/account/settings/PreferencesReducer;->getSoundVibrateLightTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceHeaderRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->rows:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;->getSoundText()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    invoke-interface {v2}, Lcom/ibotta/android/state/app/fcm/FcmState;->isAlertSound()Z

    move-result v2

    const/4 v3, 0x1

    invoke-direct {p0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->generatePreference(Ljava/lang/String;ZZ)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->generatePreferenceRow(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->rows:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;->getVibrateText()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    invoke-interface {v2}, Lcom/ibotta/android/state/app/fcm/FcmState;->isAlertVibrate()Z

    move-result v2

    invoke-direct {p0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->generatePreference(Ljava/lang/String;ZZ)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->generatePreferenceRow(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->rows:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;->getLightText()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    invoke-interface {v2}, Lcom/ibotta/android/state/app/fcm/FcmState;->isAlertLight()Z

    move-result v2

    invoke-direct {p0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->generatePreference(Ljava/lang/String;ZZ)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->generatePreferenceRow(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private generatePreference(Lcom/ibotta/api/model/customer/CustomerSetting;)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;
    .locals 3

    .line 198
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;-><init>()V

    .line 199
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerSetting;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->setName(Ljava/lang/String;)V

    .line 200
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerSetting;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->setLabel(Ljava/lang/String;)V

    const-string v1, "push_location"

    .line 202
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerSetting;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 204
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/user/UserState;->isGeofencingEnabled()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->setChecked(Z)V

    const/4 p1, 0x1

    .line 205
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->setLocal(Z)V

    goto :goto_0

    .line 207
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerSetting;->getValueBool()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->setChecked(Z)V

    :goto_0
    return-object v0
.end method

.method private generatePreference(Ljava/lang/String;ZZ)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;
    .locals 1

    .line 214
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;-><init>()V

    .line 215
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->setName(Ljava/lang/String;)V

    .line 216
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->setLabel(Ljava/lang/String;)V

    .line 217
    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->setChecked(Z)V

    .line 218
    invoke-virtual {v0, p3}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->setLocal(Z)V

    return-object v0
.end method

.method private generatePreferenceRow(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;
    .locals 1

    .line 184
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;-><init>()V

    .line 185
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;->setPreference(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;)V

    return-object v0
.end method

.method private generatePreferenceRow(Lcom/ibotta/api/model/customer/CustomerSetting;)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;
    .locals 0

    .line 180
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->generatePreference(Lcom/ibotta/api/model/customer/CustomerSetting;)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->generatePreferenceRow(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;

    move-result-object p1

    return-object p1
.end method

.method private updatePreferenceState(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;Z)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->CHANGED_PREFERENCE:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {p2}, Lorg/aspectj/runtime/internal/Conversions;->booleanObject(Z)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, p1, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 136
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->setChecked(Z)V

    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 67
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 69
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 70
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 72
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 74
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->preferencesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 75
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerSettingsCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerSettingsCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->preferencesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 77
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->preferencesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 84
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 85
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->preferencesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 6

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->preferencesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 91
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;->getGroups()Ljava/util/List;

    move-result-object v0

    .line 92
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->rows:Ljava/util/List;

    .line 94
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/customer/CustomerSettingsGroup;

    .line 95
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->rows:Ljava/util/List;

    new-instance v3, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceHeaderRow;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->preferencesReducer:Lcom/ibotta/android/account/settings/PreferencesReducer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/CustomerSettingsGroup;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/ibotta/android/account/settings/PreferencesReducer;->createSectionTitle(Ljava/lang/String;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceHeaderRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/CustomerSettingsGroup;->getSettings()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/customer/CustomerSetting;

    .line 98
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->rows:Ljava/util/List;

    invoke-direct {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->generatePreferenceRow(Lcom/ibotta/api/model/customer/CustomerSetting;)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 103
    :cond_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->generateLocalPreferences()V

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->rows:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;->setRows(Ljava/util/List;)V

    return-void
.end method

.method public onPreferenceClicked(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;)V
    .locals 4

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;

    .line 123
    instance-of v2, v1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;

    if-eqz v2, :cond_0

    .line 124
    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;->getPreference()Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    move-result-object v1

    .line 126
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 127
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->isChecked()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-direct {p0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->updatePreferenceState(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;Z)V

    :cond_1
    return-void
.end method

.method public onSaveClicked()V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 142
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getEmail()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->email:Ljava/lang/String;

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->email:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;->displayPasswordPrompt(Ljava/lang/String;)V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 2

    .line 110
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractPasswordUsingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 112
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 114
    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;

    .line 113
    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/appcache/AppCache;->updateCustomerSettings(ILcom/ibotta/api/call/customer/CustomerSettingsPutResponse;)V

    .line 115
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;->onSaveSuccess()V

    :cond_0
    return-void
.end method

.method public savePreferences(Ljava/lang/String;)V
    .locals 5

    .line 148
    new-instance v0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;

    invoke-direct {v0}, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;-><init>()V

    .line 149
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;->setCustomerId(I)V

    .line 150
    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;->setPassword(Ljava/lang/String;)V

    .line 151
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 153
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->rows:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;

    .line 154
    instance-of v3, v2, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;

    if-eqz v3, :cond_0

    .line 155
    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;->getPreference()Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    move-result-object v2

    .line 156
    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->isLocal()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 158
    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->getName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v4, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;

    invoke-interface {v4}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;->getSoundText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 159
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->isChecked()Z

    move-result v2

    invoke-interface {v3, v2}, Lcom/ibotta/android/state/app/fcm/FcmState;->setAlertSound(Z)V

    goto :goto_0

    .line 160
    :cond_1
    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->getName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v4, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;

    invoke-interface {v4}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;->getVibrateText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 161
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->isChecked()Z

    move-result v2

    invoke-interface {v3, v2}, Lcom/ibotta/android/state/app/fcm/FcmState;->setAlertVibrate(Z)V

    goto :goto_0

    .line 162
    :cond_2
    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->getName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v4, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;

    invoke-interface {v4}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;->getLightText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 163
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->isChecked()Z

    move-result v2

    invoke-interface {v3, v2}, Lcom/ibotta/android/state/app/fcm/FcmState;->setAlertLight(Z)V

    goto :goto_0

    :cond_3
    const-string v3, "push_location"

    .line 164
    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 166
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->isChecked()Z

    move-result v2

    invoke-interface {v3, v2}, Lcom/ibotta/android/state/user/UserState;->setGeofencingEnabled(Z)V

    goto/16 :goto_0

    .line 169
    :cond_4
    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->getIsCheckedValue()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 173
    :cond_5
    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;->setSettings(Ljava/util/Map;)V

    .line 175
    new-instance p1, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;

    invoke-direct {p1, v0}, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;-><init>(Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;)V

    .line 176
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method
