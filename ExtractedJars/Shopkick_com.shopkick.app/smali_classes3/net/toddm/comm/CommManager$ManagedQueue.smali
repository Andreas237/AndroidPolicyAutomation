.class final enum Lnet/toddm/comm/CommManager$ManagedQueue;
.super Ljava/lang/Enum;
.source "CommManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/comm/CommManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "ManagedQueue"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/toddm/comm/CommManager$ManagedQueue;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ACTIVE:Lnet/toddm/comm/CommManager$ManagedQueue;

.field private static final synthetic ENUM$VALUES:[Lnet/toddm/comm/CommManager$ManagedQueue;

.field public static final enum QUEUED:Lnet/toddm/comm/CommManager$ManagedQueue;

.field public static final enum RETRY:Lnet/toddm/comm/CommManager$ManagedQueue;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 457
    new-instance v0, Lnet/toddm/comm/CommManager$ManagedQueue;

    const-string v1, "QUEUED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/toddm/comm/CommManager$ManagedQueue;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/toddm/comm/CommManager$ManagedQueue;->QUEUED:Lnet/toddm/comm/CommManager$ManagedQueue;

    .line 458
    new-instance v0, Lnet/toddm/comm/CommManager$ManagedQueue;

    const-string v1, "ACTIVE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lnet/toddm/comm/CommManager$ManagedQueue;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/toddm/comm/CommManager$ManagedQueue;->ACTIVE:Lnet/toddm/comm/CommManager$ManagedQueue;

    .line 459
    new-instance v0, Lnet/toddm/comm/CommManager$ManagedQueue;

    const-string v1, "RETRY"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lnet/toddm/comm/CommManager$ManagedQueue;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/toddm/comm/CommManager$ManagedQueue;->RETRY:Lnet/toddm/comm/CommManager$ManagedQueue;

    const/4 v0, 0x3

    .line 456
    new-array v0, v0, [Lnet/toddm/comm/CommManager$ManagedQueue;

    sget-object v1, Lnet/toddm/comm/CommManager$ManagedQueue;->QUEUED:Lnet/toddm/comm/CommManager$ManagedQueue;

    aput-object v1, v0, v2

    sget-object v1, Lnet/toddm/comm/CommManager$ManagedQueue;->ACTIVE:Lnet/toddm/comm/CommManager$ManagedQueue;

    aput-object v1, v0, v3

    sget-object v1, Lnet/toddm/comm/CommManager$ManagedQueue;->RETRY:Lnet/toddm/comm/CommManager$ManagedQueue;

    aput-object v1, v0, v4

    sput-object v0, Lnet/toddm/comm/CommManager$ManagedQueue;->ENUM$VALUES:[Lnet/toddm/comm/CommManager$ManagedQueue;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 456
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/toddm/comm/CommManager$ManagedQueue;
    .locals 1

    .line 1
    const-class v0, Lnet/toddm/comm/CommManager$ManagedQueue;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/toddm/comm/CommManager$ManagedQueue;

    return-object p0
.end method

.method public static values()[Lnet/toddm/comm/CommManager$ManagedQueue;
    .locals 4

    .line 1
    sget-object v0, Lnet/toddm/comm/CommManager$ManagedQueue;->ENUM$VALUES:[Lnet/toddm/comm/CommManager$ManagedQueue;

    array-length v1, v0

    new-array v2, v1, [Lnet/toddm/comm/CommManager$ManagedQueue;

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
