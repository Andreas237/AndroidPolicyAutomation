.class final enum Ljava9/util/stream/MatchOps$MatchKind;
.super Ljava/lang/Enum;
.source "MatchOps.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/stream/MatchOps;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "MatchKind"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljava9/util/stream/MatchOps$MatchKind;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ljava9/util/stream/MatchOps$MatchKind;

.field public static final enum ALL:Ljava9/util/stream/MatchOps$MatchKind;

.field public static final enum ANY:Ljava9/util/stream/MatchOps$MatchKind;

.field public static final enum NONE:Ljava9/util/stream/MatchOps$MatchKind;


# instance fields
.field private final shortCircuitResult:Z

.field private final stopOnPredicateMatches:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 52
    new-instance v0, Ljava9/util/stream/MatchOps$MatchKind;

    const-string v1, "ANY"

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v2}, Ljava9/util/stream/MatchOps$MatchKind;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Ljava9/util/stream/MatchOps$MatchKind;->ANY:Ljava9/util/stream/MatchOps$MatchKind;

    .line 55
    new-instance v0, Ljava9/util/stream/MatchOps$MatchKind;

    const-string v1, "ALL"

    invoke-direct {v0, v1, v2, v3, v3}, Ljava9/util/stream/MatchOps$MatchKind;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Ljava9/util/stream/MatchOps$MatchKind;->ALL:Ljava9/util/stream/MatchOps$MatchKind;

    .line 58
    new-instance v0, Ljava9/util/stream/MatchOps$MatchKind;

    const-string v1, "NONE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v2, v3}, Ljava9/util/stream/MatchOps$MatchKind;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Ljava9/util/stream/MatchOps$MatchKind;->NONE:Ljava9/util/stream/MatchOps$MatchKind;

    const/4 v0, 0x3

    .line 50
    new-array v0, v0, [Ljava9/util/stream/MatchOps$MatchKind;

    sget-object v1, Ljava9/util/stream/MatchOps$MatchKind;->ANY:Ljava9/util/stream/MatchOps$MatchKind;

    aput-object v1, v0, v3

    sget-object v1, Ljava9/util/stream/MatchOps$MatchKind;->ALL:Ljava9/util/stream/MatchOps$MatchKind;

    aput-object v1, v0, v2

    sget-object v1, Ljava9/util/stream/MatchOps$MatchKind;->NONE:Ljava9/util/stream/MatchOps$MatchKind;

    aput-object v1, v0, v4

    sput-object v0, Ljava9/util/stream/MatchOps$MatchKind;->$VALUES:[Ljava9/util/stream/MatchOps$MatchKind;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)V"
        }
    .end annotation

    .line 64
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 65
    iput-boolean p3, p0, Ljava9/util/stream/MatchOps$MatchKind;->stopOnPredicateMatches:Z

    .line 66
    iput-boolean p4, p0, Ljava9/util/stream/MatchOps$MatchKind;->shortCircuitResult:Z

    return-void
.end method

.method static synthetic access$000(Ljava9/util/stream/MatchOps$MatchKind;)Z
    .locals 0

    .line 50
    iget-boolean p0, p0, Ljava9/util/stream/MatchOps$MatchKind;->stopOnPredicateMatches:Z

    return p0
.end method

.method static synthetic access$100(Ljava9/util/stream/MatchOps$MatchKind;)Z
    .locals 0

    .line 50
    iget-boolean p0, p0, Ljava9/util/stream/MatchOps$MatchKind;->shortCircuitResult:Z

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Ljava9/util/stream/MatchOps$MatchKind;
    .locals 1

    .line 50
    const-class v0, Ljava9/util/stream/MatchOps$MatchKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljava9/util/stream/MatchOps$MatchKind;

    return-object p0
.end method

.method public static values()[Ljava9/util/stream/MatchOps$MatchKind;
    .locals 1

    .line 50
    sget-object v0, Ljava9/util/stream/MatchOps$MatchKind;->$VALUES:[Ljava9/util/stream/MatchOps$MatchKind;

    invoke-virtual {v0}, [Ljava9/util/stream/MatchOps$MatchKind;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava9/util/stream/MatchOps$MatchKind;

    return-object v0
.end method
