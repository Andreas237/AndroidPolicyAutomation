.class public final enum Lorg/jivesoftware/smack/packet/Presence$Type;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/packet/Presence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lorg/jivesoftware/smack/packet/Presence$Type;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jivesoftware/smack/packet/Presence$Type;

.field public static final enum available:Lorg/jivesoftware/smack/packet/Presence$Type;

.field public static final enum error:Lorg/jivesoftware/smack/packet/Presence$Type;

.field public static final enum probe:Lorg/jivesoftware/smack/packet/Presence$Type;

.field public static final enum subscribe:Lorg/jivesoftware/smack/packet/Presence$Type;

.field public static final enum subscribed:Lorg/jivesoftware/smack/packet/Presence$Type;

.field public static final enum unavailable:Lorg/jivesoftware/smack/packet/Presence$Type;

.field public static final enum unsubscribe:Lorg/jivesoftware/smack/packet/Presence$Type;

.field public static final enum unsubscribed:Lorg/jivesoftware/smack/packet/Presence$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 326
    new-instance v0, Lorg/jivesoftware/smack/packet/Presence$Type;

    const-string v1, "available"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/Presence$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Type;->available:Lorg/jivesoftware/smack/packet/Presence$Type;

    .line 331
    new-instance v0, Lorg/jivesoftware/smack/packet/Presence$Type;

    const-string v1, "unavailable"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/Presence$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Type;->unavailable:Lorg/jivesoftware/smack/packet/Presence$Type;

    .line 336
    new-instance v0, Lorg/jivesoftware/smack/packet/Presence$Type;

    const-string v1, "subscribe"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/Presence$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Type;->subscribe:Lorg/jivesoftware/smack/packet/Presence$Type;

    .line 341
    new-instance v0, Lorg/jivesoftware/smack/packet/Presence$Type;

    const-string v1, "subscribed"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/Presence$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Type;->subscribed:Lorg/jivesoftware/smack/packet/Presence$Type;

    .line 346
    new-instance v0, Lorg/jivesoftware/smack/packet/Presence$Type;

    const-string v1, "unsubscribe"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/Presence$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Type;->unsubscribe:Lorg/jivesoftware/smack/packet/Presence$Type;

    .line 351
    new-instance v0, Lorg/jivesoftware/smack/packet/Presence$Type;

    const-string v1, "unsubscribed"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/Presence$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Type;->unsubscribed:Lorg/jivesoftware/smack/packet/Presence$Type;

    .line 356
    new-instance v0, Lorg/jivesoftware/smack/packet/Presence$Type;

    const-string v1, "error"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/Presence$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Type;->error:Lorg/jivesoftware/smack/packet/Presence$Type;

    .line 361
    new-instance v0, Lorg/jivesoftware/smack/packet/Presence$Type;

    const-string v1, "probe"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/Presence$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Type;->probe:Lorg/jivesoftware/smack/packet/Presence$Type;

    .line 321
    const/16 v0, 0x8

    new-array v0, v0, [Lorg/jivesoftware/smack/packet/Presence$Type;

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Type;->available:Lorg/jivesoftware/smack/packet/Presence$Type;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Type;->unavailable:Lorg/jivesoftware/smack/packet/Presence$Type;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Type;->subscribe:Lorg/jivesoftware/smack/packet/Presence$Type;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Type;->subscribed:Lorg/jivesoftware/smack/packet/Presence$Type;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Type;->unsubscribe:Lorg/jivesoftware/smack/packet/Presence$Type;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Type;->unsubscribed:Lorg/jivesoftware/smack/packet/Presence$Type;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Type;->error:Lorg/jivesoftware/smack/packet/Presence$Type;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Type;->probe:Lorg/jivesoftware/smack/packet/Presence$Type;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Type;->$VALUES:[Lorg/jivesoftware/smack/packet/Presence$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 321
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Presence$Type;
    .locals 1

    .line 375
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/packet/Presence$Type;->valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Presence$Type;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Presence$Type;
    .locals 1

    .line 321
    const-class v0, Lorg/jivesoftware/smack/packet/Presence$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/Presence$Type;

    return-object v0
.end method

.method public static values()[Lorg/jivesoftware/smack/packet/Presence$Type;
    .locals 1

    .line 321
    sget-object v0, Lorg/jivesoftware/smack/packet/Presence$Type;->$VALUES:[Lorg/jivesoftware/smack/packet/Presence$Type;

    invoke-virtual {v0}, [Lorg/jivesoftware/smack/packet/Presence$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jivesoftware/smack/packet/Presence$Type;

    return-object v0
.end method
