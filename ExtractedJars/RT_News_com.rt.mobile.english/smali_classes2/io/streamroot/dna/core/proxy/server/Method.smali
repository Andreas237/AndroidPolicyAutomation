.class public final enum Lio/streamroot/dna/core/proxy/server/Method;
.super Ljava/lang/Enum;
.source "Method.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/proxy/server/Method$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/streamroot/dna/core/proxy/server/Method;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0013\u0008\u0086\u0001\u0018\u0000 \u00132\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/streamroot/dna/core/proxy/server/Method;",
        "",
        "(Ljava/lang/String;I)V",
        "GET",
        "PUT",
        "POST",
        "DELETE",
        "HEAD",
        "OPTIONS",
        "TRACE",
        "CONNECT",
        "PATCH",
        "PROPFIND",
        "PROPPATCH",
        "MKCOL",
        "MOVE",
        "COPY",
        "LOCK",
        "UNLOCK",
        "Companion",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum CONNECT:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum COPY:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final Companion:Lio/streamroot/dna/core/proxy/server/Method$Companion;

.field public static final enum DELETE:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum GET:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum HEAD:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum LOCK:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum MKCOL:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum MOVE:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum OPTIONS:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum PATCH:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum POST:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum PROPFIND:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum PROPPATCH:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum PUT:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum TRACE:Lio/streamroot/dna/core/proxy/server/Method;

.field public static final enum UNLOCK:Lio/streamroot/dna/core/proxy/server/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x10

    new-array v0, v0, [Lio/streamroot/dna/core/proxy/server/Method;

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "GET"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->GET:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "PUT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->PUT:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "POST"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->POST:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "DELETE"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->DELETE:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "HEAD"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->HEAD:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "OPTIONS"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->OPTIONS:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "TRACE"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->TRACE:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "CONNECT"

    const/4 v3, 0x7

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->CONNECT:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "PATCH"

    const/16 v3, 0x8

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->PATCH:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "PROPFIND"

    const/16 v3, 0x9

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->PROPFIND:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "PROPPATCH"

    const/16 v3, 0xa

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->PROPPATCH:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "MKCOL"

    const/16 v3, 0xb

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->MKCOL:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "MOVE"

    const/16 v3, 0xc

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->MOVE:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "COPY"

    const/16 v3, 0xd

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->COPY:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "LOCK"

    const/16 v3, 0xe

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->LOCK:Lio/streamroot/dna/core/proxy/server/Method;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/proxy/server/Method;

    const-string v2, "UNLOCK"

    const/16 v3, 0xf

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/proxy/server/Method;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/proxy/server/Method;->UNLOCK:Lio/streamroot/dna/core/proxy/server/Method;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sput-object v0, Lio/streamroot/dna/core/proxy/server/Method;->$VALUES:[Lio/streamroot/dna/core/proxy/server/Method;

    new-instance v0, Lio/streamroot/dna/core/proxy/server/Method$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/proxy/server/Method$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/proxy/server/Method;->Companion:Lio/streamroot/dna/core/proxy/server/Method$Companion;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/streamroot/dna/core/proxy/server/Method;
    .locals 1

    const-class v0, Lio/streamroot/dna/core/proxy/server/Method;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/core/proxy/server/Method;

    return-object p0
.end method

.method public static values()[Lio/streamroot/dna/core/proxy/server/Method;
    .locals 1

    sget-object v0, Lio/streamroot/dna/core/proxy/server/Method;->$VALUES:[Lio/streamroot/dna/core/proxy/server/Method;

    invoke-virtual {v0}, [Lio/streamroot/dna/core/proxy/server/Method;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/streamroot/dna/core/proxy/server/Method;

    return-object v0
.end method
