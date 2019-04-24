.class public final Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;
.super Ljava/lang/Object;
.source "AlertMessageViewEvents.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;",
        "",
        "()V",
        "NO_OP",
        "Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;",
        "getNO_OP",
        "()Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;

.field private static final NO_OP:Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;

    invoke-direct {v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;-><init>()V

    sput-object v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;->$$INSTANCE:Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;

    .line 12
    new-instance v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion$NO_OP$1;

    invoke-direct {v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion$NO_OP$1;-><init>()V

    check-cast v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;

    sput-object v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;->NO_OP:Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getNO_OP()Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 12
    sget-object v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;->NO_OP:Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;

    return-object v0
.end method
