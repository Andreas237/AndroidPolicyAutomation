.class public final enum Lcom/moat/analytics/mobile/spck/i$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/moat/analytics/mobile/spck/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401c
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/moat/analytics/mobile/spck/i$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/moat/analytics/mobile/spck/i$a;

.field public static final enum b:Lcom/moat/analytics/mobile/spck/i$a;

.field public static final enum c:Lcom/moat/analytics/mobile/spck/i$a;

.field public static final enum d:Lcom/moat/analytics/mobile/spck/i$a;

.field public static final enum e:Lcom/moat/analytics/mobile/spck/i$a;

.field private static final synthetic f:[Lcom/moat/analytics/mobile/spck/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/moat/analytics/mobile/spck/i$a;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/moat/analytics/mobile/spck/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/i$a;->a:Lcom/moat/analytics/mobile/spck/i$a;

    new-instance v0, Lcom/moat/analytics/mobile/spck/i$a;

    const-string v1, "PAUSED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/moat/analytics/mobile/spck/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/i$a;->b:Lcom/moat/analytics/mobile/spck/i$a;

    new-instance v0, Lcom/moat/analytics/mobile/spck/i$a;

    const-string v1, "PLAYING"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/moat/analytics/mobile/spck/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/i$a;->c:Lcom/moat/analytics/mobile/spck/i$a;

    new-instance v0, Lcom/moat/analytics/mobile/spck/i$a;

    const-string v1, "STOPPED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/moat/analytics/mobile/spck/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/i$a;->d:Lcom/moat/analytics/mobile/spck/i$a;

    new-instance v0, Lcom/moat/analytics/mobile/spck/i$a;

    const-string v1, "COMPLETED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/moat/analytics/mobile/spck/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/moat/analytics/mobile/spck/i$a;->e:Lcom/moat/analytics/mobile/spck/i$a;

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/moat/analytics/mobile/spck/i$a;

    sget-object v1, Lcom/moat/analytics/mobile/spck/i$a;->a:Lcom/moat/analytics/mobile/spck/i$a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/moat/analytics/mobile/spck/i$a;->b:Lcom/moat/analytics/mobile/spck/i$a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/moat/analytics/mobile/spck/i$a;->c:Lcom/moat/analytics/mobile/spck/i$a;

    aput-object v1, v0, v4

    sget-object v1, Lcom/moat/analytics/mobile/spck/i$a;->d:Lcom/moat/analytics/mobile/spck/i$a;

    aput-object v1, v0, v5

    sget-object v1, Lcom/moat/analytics/mobile/spck/i$a;->e:Lcom/moat/analytics/mobile/spck/i$a;

    aput-object v1, v0, v6

    sput-object v0, Lcom/moat/analytics/mobile/spck/i$a;->f:[Lcom/moat/analytics/mobile/spck/i$a;

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

.method public static valueOf(Ljava/lang/String;)Lcom/moat/analytics/mobile/spck/i$a;
    .locals 1

    const-class v0, Lcom/moat/analytics/mobile/spck/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/moat/analytics/mobile/spck/i$a;

    return-object p0
.end method

.method public static values()[Lcom/moat/analytics/mobile/spck/i$a;
    .locals 1

    sget-object v0, Lcom/moat/analytics/mobile/spck/i$a;->f:[Lcom/moat/analytics/mobile/spck/i$a;

    invoke-virtual {v0}, [Lcom/moat/analytics/mobile/spck/i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/moat/analytics/mobile/spck/i$a;

    return-object v0
.end method
