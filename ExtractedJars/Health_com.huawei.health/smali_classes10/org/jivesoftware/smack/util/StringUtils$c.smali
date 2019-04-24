.class final enum Lorg/jivesoftware/smack/util/StringUtils$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/util/StringUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lorg/jivesoftware/smack/util/StringUtils$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lorg/jivesoftware/smack/util/StringUtils$c;

.field private static final synthetic b:[Lorg/jivesoftware/smack/util/StringUtils$c;

.field public static final enum c:Lorg/jivesoftware/smack/util/StringUtils$c;

.field public static final enum d:Lorg/jivesoftware/smack/util/StringUtils$c;

.field public static final enum e:Lorg/jivesoftware/smack/util/StringUtils$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 87
    new-instance v0, Lorg/jivesoftware/smack/util/StringUtils$c;

    const-string v1, "safe"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/util/StringUtils$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/util/StringUtils$c;->e:Lorg/jivesoftware/smack/util/StringUtils$c;

    .line 88
    new-instance v0, Lorg/jivesoftware/smack/util/StringUtils$c;

    const-string v1, "forAttribute"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/util/StringUtils$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/util/StringUtils$c;->c:Lorg/jivesoftware/smack/util/StringUtils$c;

    .line 89
    new-instance v0, Lorg/jivesoftware/smack/util/StringUtils$c;

    const-string v1, "forAttributeApos"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/util/StringUtils$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/util/StringUtils$c;->a:Lorg/jivesoftware/smack/util/StringUtils$c;

    .line 90
    new-instance v0, Lorg/jivesoftware/smack/util/StringUtils$c;

    const-string v1, "forText"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/util/StringUtils$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/util/StringUtils$c;->d:Lorg/jivesoftware/smack/util/StringUtils$c;

    .line 86
    const/4 v0, 0x4

    new-array v0, v0, [Lorg/jivesoftware/smack/util/StringUtils$c;

    sget-object v1, Lorg/jivesoftware/smack/util/StringUtils$c;->e:Lorg/jivesoftware/smack/util/StringUtils$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/util/StringUtils$c;->c:Lorg/jivesoftware/smack/util/StringUtils$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/util/StringUtils$c;->a:Lorg/jivesoftware/smack/util/StringUtils$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/util/StringUtils$c;->d:Lorg/jivesoftware/smack/util/StringUtils$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lorg/jivesoftware/smack/util/StringUtils$c;->b:[Lorg/jivesoftware/smack/util/StringUtils$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 86
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/util/StringUtils$c;
    .locals 1

    .line 86
    const-class v0, Lorg/jivesoftware/smack/util/StringUtils$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/util/StringUtils$c;

    return-object v0
.end method

.method public static values()[Lorg/jivesoftware/smack/util/StringUtils$c;
    .locals 1

    .line 86
    sget-object v0, Lorg/jivesoftware/smack/util/StringUtils$c;->b:[Lorg/jivesoftware/smack/util/StringUtils$c;

    invoke-virtual {v0}, [Lorg/jivesoftware/smack/util/StringUtils$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jivesoftware/smack/util/StringUtils$c;

    return-object v0
.end method
