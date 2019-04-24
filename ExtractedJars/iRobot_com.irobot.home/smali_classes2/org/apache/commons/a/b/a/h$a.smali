.class public final enum Lorg/apache/commons/a/b/a/h$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/commons/a/b/a/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/commons/a/b/a/h$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/commons/a/b/a/h$a;

.field public static final enum errorIfNoSemiColon:Lorg/apache/commons/a/b/a/h$a;

.field public static final enum semiColonOptional:Lorg/apache/commons/a/b/a/h$a;

.field public static final enum semiColonRequired:Lorg/apache/commons/a/b/a/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lorg/apache/commons/a/b/a/h$a;

    const-string v1, "semiColonRequired"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/a/b/a/h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/apache/commons/a/b/a/h$a;->semiColonRequired:Lorg/apache/commons/a/b/a/h$a;

    new-instance v0, Lorg/apache/commons/a/b/a/h$a;

    const-string v1, "semiColonOptional"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lorg/apache/commons/a/b/a/h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/apache/commons/a/b/a/h$a;->semiColonOptional:Lorg/apache/commons/a/b/a/h$a;

    new-instance v0, Lorg/apache/commons/a/b/a/h$a;

    const-string v1, "errorIfNoSemiColon"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lorg/apache/commons/a/b/a/h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/apache/commons/a/b/a/h$a;->errorIfNoSemiColon:Lorg/apache/commons/a/b/a/h$a;

    const/4 v0, 0x3

    new-array v0, v0, [Lorg/apache/commons/a/b/a/h$a;

    sget-object v1, Lorg/apache/commons/a/b/a/h$a;->semiColonRequired:Lorg/apache/commons/a/b/a/h$a;

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/commons/a/b/a/h$a;->semiColonOptional:Lorg/apache/commons/a/b/a/h$a;

    aput-object v1, v0, v3

    sget-object v1, Lorg/apache/commons/a/b/a/h$a;->errorIfNoSemiColon:Lorg/apache/commons/a/b/a/h$a;

    aput-object v1, v0, v4

    sput-object v0, Lorg/apache/commons/a/b/a/h$a;->$VALUES:[Lorg/apache/commons/a/b/a/h$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/commons/a/b/a/h$a;
    .locals 1

    const-class v0, Lorg/apache/commons/a/b/a/h$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/a/b/a/h$a;

    return-object p0
.end method

.method public static values()[Lorg/apache/commons/a/b/a/h$a;
    .locals 1

    sget-object v0, Lorg/apache/commons/a/b/a/h$a;->$VALUES:[Lorg/apache/commons/a/b/a/h$a;

    invoke-virtual {v0}, [Lorg/apache/commons/a/b/a/h$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/apache/commons/a/b/a/h$a;

    return-object v0
.end method
