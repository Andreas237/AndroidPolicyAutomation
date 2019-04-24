.class public final Lio/radar/sdk/location/LocationManagerRepository;
.super Lio/radar/sdk/internal/repository/BaseRepository;
.source "LocationManagerRepository.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/location/LocationManagerRepository$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLocationManagerRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationManagerRepository.kt\nio/radar/sdk/location/LocationManagerRepository\n+ 2 SharedPreferences.kt\nio/radar/sdk/internal/extensions/SharedPreferencesKt\n*L\n1#1,23:1\n11#2,4:24\n*E\n*S KotlinDebug\n*F\n+ 1 LocationManagerRepository.kt\nio/radar/sdk/location/LocationManagerRepository\n*L\n21#1,4:24\n*E\n"
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
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u000f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lio/radar/sdk/location/LocationManagerRepository;",
        "Lio/radar/sdk/internal/repository/BaseRepository;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "value",
        "",
        "hasStarted",
        "getHasStarted$sdk_release",
        "()Z",
        "setHasStarted$sdk_release",
        "(Z)V",
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
.field public static final Companion:Lio/radar/sdk/location/LocationManagerRepository$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/radar/sdk/location/LocationManagerRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/location/LocationManagerRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/location/LocationManagerRepository;->Companion:Lio/radar/sdk/location/LocationManagerRepository$Companion;

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

    .line 13
    invoke-direct {p0, p1}, Lio/radar/sdk/internal/repository/BaseRepository;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final getHasStarted$sdk_release()Z
    .locals 3

    .line 22
    invoke-virtual {p0}, Lio/radar/sdk/location/LocationManagerRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "has_started"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final setHasStarted$sdk_release(Z)V
    .locals 2

    .line 21
    invoke-virtual {p0}, Lio/radar/sdk/location/LocationManagerRepository;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 24
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "editor"

    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "has_started"

    .line 21
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 26
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
