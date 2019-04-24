.class public final enum Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/ConnectionConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SecurityMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

.field public static final enum disabled:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

.field public static final enum ifpossible:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

.field public static final enum required:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 376
    new-instance v0, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    const-string v1, "required"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->required:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    .line 387
    new-instance v0, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    const-string v1, "ifpossible"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->ifpossible:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    .line 394
    new-instance v0, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    const-string v1, "disabled"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->disabled:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    .line 369
    const/4 v0, 0x3

    new-array v0, v0, [Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    sget-object v1, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->required:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->ifpossible:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->disabled:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->$VALUES:[Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 369
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;
    .locals 1

    .line 369
    const-class v0, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    return-object v0
.end method

.method public static values()[Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;
    .locals 1

    .line 369
    sget-object v0, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->$VALUES:[Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    invoke-virtual {v0}, [Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    return-object v0
.end method
