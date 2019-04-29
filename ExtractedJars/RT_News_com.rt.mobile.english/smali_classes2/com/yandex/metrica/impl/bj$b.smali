.class Lcom/yandex/metrica/impl/bj$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/support/annotation/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/bj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field static final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 99
    new-instance v0, Lcom/yandex/metrica/impl/bj$b;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/bj$b;-><init>()V

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/bj$b;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/bj$b;->a:Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const-string v0, "native"

    const-string v1, "com.unity3d.player.UnityPlayer"

    .line 106
    invoke-virtual {p0, v1}, Lcom/yandex/metrica/impl/bj$b;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "unity"

    goto :goto_0

    :cond_0
    const-string v1, "mono.MonoPackageManager"

    .line 108
    invoke-virtual {p0, v1}, Lcom/yandex/metrica/impl/bj$b;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "xamarin"

    goto :goto_0

    :cond_1
    const-string v1, "org.apache.cordova.CordovaPlugin"

    .line 110
    invoke-virtual {p0, v1}, Lcom/yandex/metrica/impl/bj$b;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "cordova"

    goto :goto_0

    :cond_2
    const-string v1, "com.facebook.react.ReactRootView"

    .line 112
    invoke-virtual {p0, v1}, Lcom/yandex/metrica/impl/bj$b;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v0, "react"

    :cond_3
    :goto_0
    return-object v0
.end method

.method a(Ljava/lang/String;)Z
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 120
    invoke-static {p1}, Lcom/yandex/metrica/impl/bj;->b(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
