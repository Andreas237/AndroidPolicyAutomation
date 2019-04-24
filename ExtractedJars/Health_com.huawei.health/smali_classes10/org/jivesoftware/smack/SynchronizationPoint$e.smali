.class final enum Lorg/jivesoftware/smack/SynchronizationPoint$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/SynchronizationPoint;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lorg/jivesoftware/smack/SynchronizationPoint$e;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lorg/jivesoftware/smack/SynchronizationPoint$e;

.field public static final enum b:Lorg/jivesoftware/smack/SynchronizationPoint$e;

.field public static final enum c:Lorg/jivesoftware/smack/SynchronizationPoint$e;

.field public static final enum d:Lorg/jivesoftware/smack/SynchronizationPoint$e;

.field public static final enum e:Lorg/jivesoftware/smack/SynchronizationPoint$e;

.field private static final synthetic i:[Lorg/jivesoftware/smack/SynchronizationPoint$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 271
    new-instance v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;

    const-string v1, "Initial"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/SynchronizationPoint$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;->c:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    .line 272
    new-instance v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;

    const-string v1, "RequestSent"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/SynchronizationPoint$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;->e:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    .line 273
    new-instance v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;

    const-string v1, "NoResponse"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/SynchronizationPoint$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;->d:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    .line 274
    new-instance v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;

    const-string v1, "Success"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/SynchronizationPoint$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;->b:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    .line 275
    new-instance v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;

    const-string v1, "Failure"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/SynchronizationPoint$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;->a:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    .line 270
    const/4 v0, 0x5

    new-array v0, v0, [Lorg/jivesoftware/smack/SynchronizationPoint$e;

    sget-object v1, Lorg/jivesoftware/smack/SynchronizationPoint$e;->c:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/SynchronizationPoint$e;->e:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/SynchronizationPoint$e;->d:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/SynchronizationPoint$e;->b:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/SynchronizationPoint$e;->a:Lorg/jivesoftware/smack/SynchronizationPoint$e;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;->i:[Lorg/jivesoftware/smack/SynchronizationPoint$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 270
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/SynchronizationPoint$e;
    .locals 1

    .line 270
    const-class v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;

    return-object v0
.end method

.method public static values()[Lorg/jivesoftware/smack/SynchronizationPoint$e;
    .locals 1

    .line 270
    sget-object v0, Lorg/jivesoftware/smack/SynchronizationPoint$e;->i:[Lorg/jivesoftware/smack/SynchronizationPoint$e;

    invoke-virtual {v0}, [Lorg/jivesoftware/smack/SynchronizationPoint$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jivesoftware/smack/SynchronizationPoint$e;

    return-object v0
.end method
