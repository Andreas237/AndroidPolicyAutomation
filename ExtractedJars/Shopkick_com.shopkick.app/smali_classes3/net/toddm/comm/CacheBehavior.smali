.class public final enum Lnet/toddm/comm/CacheBehavior;
.super Ljava/lang/Enum;
.source "CacheBehavior.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/toddm/comm/CacheBehavior;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

.field private static final synthetic ENUM$VALUES:[Lnet/toddm/comm/CacheBehavior;

.field public static final enum GET_ONLY_FROM_CACHE:Lnet/toddm/comm/CacheBehavior;

.field public static final enum NORMAL:Lnet/toddm/comm/CacheBehavior;

.field public static final enum SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 6
    new-instance v0, Lnet/toddm/comm/CacheBehavior;

    const-string v1, "NORMAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/toddm/comm/CacheBehavior;-><init>(Ljava/lang/String;I)V

    .line 10
    sput-object v0, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    .line 12
    new-instance v0, Lnet/toddm/comm/CacheBehavior;

    const-string v1, "DO_NOT_CACHE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lnet/toddm/comm/CacheBehavior;-><init>(Ljava/lang/String;I)V

    .line 13
    sput-object v0, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    .line 15
    new-instance v0, Lnet/toddm/comm/CacheBehavior;

    const-string v1, "GET_ONLY_FROM_CACHE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lnet/toddm/comm/CacheBehavior;-><init>(Ljava/lang/String;I)V

    .line 16
    sput-object v0, Lnet/toddm/comm/CacheBehavior;->GET_ONLY_FROM_CACHE:Lnet/toddm/comm/CacheBehavior;

    .line 18
    new-instance v0, Lnet/toddm/comm/CacheBehavior;

    const-string v1, "SERVER_DIRECTED_CACHE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lnet/toddm/comm/CacheBehavior;-><init>(Ljava/lang/String;I)V

    .line 22
    sput-object v0, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v0, 0x4

    .line 4
    new-array v0, v0, [Lnet/toddm/comm/CacheBehavior;

    sget-object v1, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    aput-object v1, v0, v2

    sget-object v1, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    aput-object v1, v0, v3

    sget-object v1, Lnet/toddm/comm/CacheBehavior;->GET_ONLY_FROM_CACHE:Lnet/toddm/comm/CacheBehavior;

    aput-object v1, v0, v4

    sget-object v1, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    aput-object v1, v0, v5

    sput-object v0, Lnet/toddm/comm/CacheBehavior;->ENUM$VALUES:[Lnet/toddm/comm/CacheBehavior;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/toddm/comm/CacheBehavior;
    .locals 1

    .line 1
    const-class v0, Lnet/toddm/comm/CacheBehavior;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/toddm/comm/CacheBehavior;

    return-object p0
.end method

.method public static values()[Lnet/toddm/comm/CacheBehavior;
    .locals 4

    .line 1
    sget-object v0, Lnet/toddm/comm/CacheBehavior;->ENUM$VALUES:[Lnet/toddm/comm/CacheBehavior;

    array-length v1, v0

    new-array v2, v1, [Lnet/toddm/comm/CacheBehavior;

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
