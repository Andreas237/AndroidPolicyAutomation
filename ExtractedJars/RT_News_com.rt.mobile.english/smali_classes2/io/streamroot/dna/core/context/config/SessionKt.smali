.class public final Lio/streamroot/dna/core/context/config/SessionKt;
.super Ljava/lang/Object;
.source "Session.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "UNDEFINED_CONF_LABEL",
        "",
        "getUNDEFINED_CONF_LABEL",
        "()Ljava/lang/String;",
        "dna-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final UNDEFINED_CONF_LABEL:Ljava/lang/String; = "UNDEFINED"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getUNDEFINED_CONF_LABEL()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 5
    sget-object v0, Lio/streamroot/dna/core/context/config/SessionKt;->UNDEFINED_CONF_LABEL:Ljava/lang/String;

    return-object v0
.end method
