.class final Lcom/ibotta/android/features/launchdarkly/LdUserTag;
.super Ljava/lang/Object;
.source "LaunchDarklyInitializer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/ibotta/android/features/launchdarkly/LdUserTag;",
        "",
        "()V",
        "APP_VERSION",
        "",
        "EMPLOYEE_TESTER",
        "NOT_REGISTERED",
        "SYSTEM",
        "ibotta-features-kotlin_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final APP_VERSION:Ljava/lang/String; = "appVersion"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final EMPLOYEE_TESTER:Ljava/lang/String; = "employeeTester"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/ibotta/android/features/launchdarkly/LdUserTag;

.field public static final NOT_REGISTERED:Ljava/lang/String; = "notRegistered"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final SYSTEM:Ljava/lang/String; = "system"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    new-instance v0, Lcom/ibotta/android/features/launchdarkly/LdUserTag;

    invoke-direct {v0}, Lcom/ibotta/android/features/launchdarkly/LdUserTag;-><init>()V

    sput-object v0, Lcom/ibotta/android/features/launchdarkly/LdUserTag;->INSTANCE:Lcom/ibotta/android/features/launchdarkly/LdUserTag;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
