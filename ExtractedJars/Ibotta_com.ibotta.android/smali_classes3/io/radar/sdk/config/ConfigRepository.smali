.class public final Lio/radar/sdk/config/ConfigRepository;
.super Lio/radar/sdk/internal/repository/BaseRepository;
.source "ConfigRepository.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/config/ConfigRepository$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConfigRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigRepository.kt\nio/radar/sdk/config/ConfigRepository\n+ 2 SharedPreferences.kt\nio/radar/sdk/internal/extensions/SharedPreferencesKt\n*L\n1#1,40:1\n11#2,4:41\n*E\n*S KotlinDebug\n*F\n+ 1 ConfigRepository.kt\nio/radar/sdk/config/ConfigRepository\n*L\n35#1,4:41\n*E\n"
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
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u00a2\u0006\u0002\u0008\u000fR\u0014\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/radar/sdk/config/ConfigRepository;",
        "Lio/radar/sdk/internal/repository/BaseRepository;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "facebookApiVersion",
        "",
        "getFacebookApiVersion$sdk_release",
        "()Ljava/lang/String;",
        "facebookPlacesFields",
        "getFacebookPlacesFields$sdk_release",
        "saveConfigJson",
        "",
        "obj",
        "Lorg/json/JSONObject;",
        "saveConfigJson$sdk_release",
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
.field public static final Companion:Lio/radar/sdk/config/ConfigRepository$Companion;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/radar/sdk/config/ConfigRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/config/ConfigRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/config/ConfigRepository;->Companion:Lio/radar/sdk/config/ConfigRepository$Companion;

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

    .line 11
    invoke-direct {p0, p1}, Lio/radar/sdk/internal/repository/BaseRepository;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final getFacebookApiVersion$sdk_release()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    invoke-virtual {p0}, Lio/radar/sdk/config/ConfigRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "facebook_api_version"

    const-string v2, "3.0"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sharedPreferences.getStr\u2026EBOOK_API_VERSION, \"3.0\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getFacebookPlacesFields$sdk_release()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 28
    invoke-virtual {p0}, Lio/radar/sdk/config/ConfigRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "facebook_places_fields"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final saveConfigJson$sdk_release(Lorg/json/JSONObject;)V
    .locals 3
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "facebookApiVersion"

    const/4 v1, 0x0

    .line 32
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "facebookPlacesFields"

    .line 33
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 35
    invoke-virtual {p0}, Lio/radar/sdk/config/ConfigRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v1

    .line 41
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "editor"

    .line 42
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "facebook_api_version"

    .line 36
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v0, "facebook_places_fields"

    .line 37
    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 43
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
