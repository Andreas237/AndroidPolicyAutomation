.class public final Lio/radar/sdk/util/PermissionsHelper;
.super Ljava/lang/Object;
.source "PermissionsHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/radar/sdk/util/PermissionsHelper;",
        "",
        "()V",
        "check",
        "",
        "context",
        "Landroid/content/Context;",
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
.field public static final INSTANCE:Lio/radar/sdk/util/PermissionsHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 8
    new-instance v0, Lio/radar/sdk/util/PermissionsHelper;

    invoke-direct {v0}, Lio/radar/sdk/util/PermissionsHelper;-><init>()V

    sput-object v0, Lio/radar/sdk/util/PermissionsHelper;->INSTANCE:Lio/radar/sdk/util/PermissionsHelper;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final check(Landroid/content/Context;)Z
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 12
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    .line 13
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v2

    .line 10
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
