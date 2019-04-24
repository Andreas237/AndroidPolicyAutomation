.class public final enum Lnet/toddm/cache/CachePriority;
.super Ljava/lang/Enum;
.source "CachePriority.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/toddm/cache/CachePriority;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lnet/toddm/cache/CachePriority;

.field public static final enum HIGH:Lnet/toddm/cache/CachePriority;

.field public static final enum LOW:Lnet/toddm/cache/CachePriority;

.field public static final enum NORMAL:Lnet/toddm/cache/CachePriority;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 25
    new-instance v0, Lnet/toddm/cache/CachePriority;

    const-string v1, "LOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/toddm/cache/CachePriority;-><init>(Ljava/lang/String;I)V

    .line 29
    sput-object v0, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    .line 31
    new-instance v0, Lnet/toddm/cache/CachePriority;

    const-string v1, "NORMAL"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lnet/toddm/cache/CachePriority;-><init>(Ljava/lang/String;I)V

    .line 32
    sput-object v0, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    .line 34
    new-instance v0, Lnet/toddm/cache/CachePriority;

    const-string v1, "HIGH"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lnet/toddm/cache/CachePriority;-><init>(Ljava/lang/String;I)V

    .line 38
    sput-object v0, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    const/4 v0, 0x3

    .line 23
    new-array v0, v0, [Lnet/toddm/cache/CachePriority;

    sget-object v1, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    aput-object v1, v0, v2

    sget-object v1, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    aput-object v1, v0, v3

    sget-object v1, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    aput-object v1, v0, v4

    sput-object v0, Lnet/toddm/cache/CachePriority;->ENUM$VALUES:[Lnet/toddm/cache/CachePriority;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/toddm/cache/CachePriority;
    .locals 1

    .line 1
    const-class v0, Lnet/toddm/cache/CachePriority;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/toddm/cache/CachePriority;

    return-object p0
.end method

.method public static values()[Lnet/toddm/cache/CachePriority;
    .locals 4

    .line 1
    sget-object v0, Lnet/toddm/cache/CachePriority;->ENUM$VALUES:[Lnet/toddm/cache/CachePriority;

    array-length v1, v0

    new-array v2, v1, [Lnet/toddm/cache/CachePriority;

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
