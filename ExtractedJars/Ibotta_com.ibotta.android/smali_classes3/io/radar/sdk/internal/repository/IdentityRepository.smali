.class public final Lio/radar/sdk/internal/repository/IdentityRepository;
.super Lio/radar/sdk/internal/repository/BaseRepository;
.source "IdentityRepository.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/internal/repository/IdentityRepository$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIdentityRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityRepository.kt\nio/radar/sdk/internal/repository/IdentityRepository\n+ 2 SharedPreferences.kt\nio/radar/sdk/internal/extensions/SharedPreferencesKt\n*L\n1#1,53:1\n11#2,4:54\n11#2,4:58\n11#2,4:62\n11#2,4:66\n11#2,4:70\n*E\n*S KotlinDebug\n*F\n+ 1 IdentityRepository.kt\nio/radar/sdk/internal/repository/IdentityRepository\n*L\n24#1,4:54\n39#1,4:58\n43#1,4:62\n47#1,4:66\n51#1,4:70\n*E\n"
.end annotation

.annotation runtime Lio/radar/shadow/javax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0013\u0008\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR(\u0010\u000c\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\r\u0010\t\"\u0004\u0008\u000e\u0010\u000bR(\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0010\u0010\t\"\u0004\u0008\u0011\u0010\u000bR(\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0013\u0010\t\"\u0004\u0008\u0014\u0010\u000bR(\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0016\u0010\t\"\u0004\u0008\u0017\u0010\u000b\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/radar/sdk/internal/repository/IdentityRepository;",
        "Lio/radar/sdk/internal/repository/BaseRepository;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "value",
        "",
        "publishableKey",
        "getPublishableKey$sdk_release",
        "()Ljava/lang/String;",
        "setPublishableKey$sdk_release",
        "(Ljava/lang/String;)V",
        "radarId",
        "getRadarId$sdk_release",
        "setRadarId$sdk_release",
        "userDescription",
        "getUserDescription$sdk_release",
        "setUserDescription$sdk_release",
        "userId",
        "getUserId$sdk_release",
        "setUserId$sdk_release",
        "userMetadata",
        "getUserMetadata$sdk_release",
        "setUserMetadata$sdk_release",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# static fields
.field public static final Companion:Lio/radar/sdk/internal/repository/IdentityRepository$Companion;


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/radar/sdk/internal/repository/IdentityRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/internal/repository/IdentityRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/internal/repository/IdentityRepository;->Companion:Lio/radar/sdk/internal/repository/IdentityRepository$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lio/radar/shadow/javax/inject/Inject;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0, p1}, Lio/radar/sdk/internal/repository/BaseRepository;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lio/radar/sdk/internal/repository/IdentityRepository;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final getPublishableKey$sdk_release()Ljava/lang/String;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 26
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/IdentityRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "publishable_key"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 28
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/radar/sdk/internal/repository/IdentityRepository;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 29
    iget-object v1, p0, Lio/radar/sdk/internal/repository/IdentityRepository;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v3, "radar_pk"

    const-string v4, "string"

    iget-object v5, p0, Lio/radar/sdk/internal/repository/IdentityRepository;->context:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-virtual {p0, v0}, Lio/radar/sdk/internal/repository/IdentityRepository;->setPublishableKey$sdk_release(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 33
    :catch_0
    sget-object v0, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    const-string v1, "No publishable key found in string resources with name \'radar_pk\'"

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lio/radar/sdk/internal/RadarLogger;->w$default(Lio/radar/sdk/internal/RadarLogger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    move-object v0, v2

    :goto_0
    return-object v0
.end method

.method public final getRadarId$sdk_release()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 52
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/IdentityRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "radar_user_id"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getUserDescription$sdk_release()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 44
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/IdentityRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "user_description"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getUserId$sdk_release()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 40
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/IdentityRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "user_id"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getUserMetadata$sdk_release()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 48
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/IdentityRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "user_metadata"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final setPublishableKey$sdk_release(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 24
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/IdentityRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 54
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 55
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "publishable_key"

    .line 24
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 56
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final setRadarId$sdk_release(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 51
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/IdentityRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 70
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 71
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "radar_user_id"

    .line 51
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 72
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final setUserId$sdk_release(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 39
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/IdentityRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 58
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 59
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "user_id"

    .line 39
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 60
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
