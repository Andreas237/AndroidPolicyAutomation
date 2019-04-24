.class public final enum Lnet/toddm/comm/Request$RequestMethod;
.super Ljava/lang/Enum;
.source "Request.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/comm/Request;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RequestMethod"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/toddm/comm/Request$RequestMethod;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lnet/toddm/comm/Request$RequestMethod;

.field public static final enum GET:Lnet/toddm/comm/Request$RequestMethod;

.field public static final enum POST:Lnet/toddm/comm/Request$RequestMethod;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 36
    new-instance v0, Lnet/toddm/comm/Request$RequestMethod;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/toddm/comm/Request$RequestMethod;-><init>(Ljava/lang/String;I)V

    .line 37
    sput-object v0, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    .line 38
    new-instance v0, Lnet/toddm/comm/Request$RequestMethod;

    const-string v1, "POST"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lnet/toddm/comm/Request$RequestMethod;-><init>(Ljava/lang/String;I)V

    .line 39
    sput-object v0, Lnet/toddm/comm/Request$RequestMethod;->POST:Lnet/toddm/comm/Request$RequestMethod;

    const/4 v0, 0x2

    .line 35
    new-array v0, v0, [Lnet/toddm/comm/Request$RequestMethod;

    sget-object v1, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    aput-object v1, v0, v2

    sget-object v1, Lnet/toddm/comm/Request$RequestMethod;->POST:Lnet/toddm/comm/Request$RequestMethod;

    aput-object v1, v0, v3

    sput-object v0, Lnet/toddm/comm/Request$RequestMethod;->ENUM$VALUES:[Lnet/toddm/comm/Request$RequestMethod;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/toddm/comm/Request$RequestMethod;
    .locals 1

    .line 1
    const-class v0, Lnet/toddm/comm/Request$RequestMethod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/toddm/comm/Request$RequestMethod;

    return-object p0
.end method

.method public static values()[Lnet/toddm/comm/Request$RequestMethod;
    .locals 4

    .line 1
    sget-object v0, Lnet/toddm/comm/Request$RequestMethod;->ENUM$VALUES:[Lnet/toddm/comm/Request$RequestMethod;

    array-length v1, v0

    new-array v2, v1, [Lnet/toddm/comm/Request$RequestMethod;

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
