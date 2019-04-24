.class public final enum Lorg/jivesoftware/smack/packet/Presence$Mode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/packet/Presence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Mode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lorg/jivesoftware/smack/packet/Presence$Mode;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jivesoftware/smack/packet/Presence$Mode;

.field public static final enum available:Lorg/jivesoftware/smack/packet/Presence$Mode;

.field public static final enum away:Lorg/jivesoftware/smack/packet/Presence$Mode;

.field public static final enum chat:Lorg/jivesoftware/smack/packet/Presence$Mode;

.field public static final enum dnd:Lorg/jivesoftware/smack/packet/Presence$Mode;

.field public static final enum xa:Lorg/jivesoftware/smack/packet/Presence$Mode;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 387
    new-instance v0, Lorg/jivesoftware/smack/packet/Presence$Mode;

    const-string v1, "chat"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/Presence$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Mode;->chat:Lorg/jivesoftware/smack/packet/Presence$Mode;

    .line 392
    new-instance v0, Lorg/jivesoftware/smack/packet/Presence$Mode;

    const-string v1, "available"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/Presence$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Mode;->available:Lorg/jivesoftware/smack/packet/Presence$Mode;

    .line 397
    new-instance v0, Lorg/jivesoftware/smack/packet/Presence$Mode;

    const-string v1, "away"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/Presence$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Mode;->away:Lorg/jivesoftware/smack/packet/Presence$Mode;

    .line 402
    new-instance v0, Lorg/jivesoftware/smack/packet/Presence$Mode;

    const-string v1, "xa"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/Presence$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Mode;->xa:Lorg/jivesoftware/smack/packet/Presence$Mode;

    .line 407
    new-instance v0, Lorg/jivesoftware/smack/packet/Presence$Mode;

    const-string v1, "dnd"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/packet/Presence$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Mode;->dnd:Lorg/jivesoftware/smack/packet/Presence$Mode;

    .line 382
    const/4 v0, 0x5

    new-array v0, v0, [Lorg/jivesoftware/smack/packet/Presence$Mode;

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Mode;->chat:Lorg/jivesoftware/smack/packet/Presence$Mode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Mode;->available:Lorg/jivesoftware/smack/packet/Presence$Mode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Mode;->away:Lorg/jivesoftware/smack/packet/Presence$Mode;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Mode;->xa:Lorg/jivesoftware/smack/packet/Presence$Mode;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Mode;->dnd:Lorg/jivesoftware/smack/packet/Presence$Mode;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lorg/jivesoftware/smack/packet/Presence$Mode;->$VALUES:[Lorg/jivesoftware/smack/packet/Presence$Mode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 382
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Presence$Mode;
    .locals 1

    .line 419
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/packet/Presence$Mode;->valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Presence$Mode;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Presence$Mode;
    .locals 1

    .line 382
    const-class v0, Lorg/jivesoftware/smack/packet/Presence$Mode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/Presence$Mode;

    return-object v0
.end method

.method public static values()[Lorg/jivesoftware/smack/packet/Presence$Mode;
    .locals 1

    .line 382
    sget-object v0, Lorg/jivesoftware/smack/packet/Presence$Mode;->$VALUES:[Lorg/jivesoftware/smack/packet/Presence$Mode;

    invoke-virtual {v0}, [Lorg/jivesoftware/smack/packet/Presence$Mode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jivesoftware/smack/packet/Presence$Mode;

    return-object v0
.end method
