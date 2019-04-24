.class public final enum Lo/fsf$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fsf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fsf$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fsf$a;

.field public static final enum b:Lo/fsf$a;

.field public static final enum c:Lo/fsf$a;

.field public static final enum d:Lo/fsf$a;

.field public static final enum e:Lo/fsf$a;

.field public static final enum f:Lo/fsf$a;

.field public static final enum g:Lo/fsf$a;

.field public static final enum h:Lo/fsf$a;

.field private static final synthetic i:[Lo/fsf$a;

.field public static final enum k:Lo/fsf$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 518
    new-instance v0, Lo/fsf$a;

    const-string v1, "NULL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fsf$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fsf$a;->c:Lo/fsf$a;

    new-instance v0, Lo/fsf$a;

    const-string v1, "DHE_DSS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/fsf$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fsf$a;->b:Lo/fsf$a;

    new-instance v0, Lo/fsf$a;

    const-string v1, "DHE_RSA"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/fsf$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fsf$a;->a:Lo/fsf$a;

    new-instance v0, Lo/fsf$a;

    const-string v1, "DH_ANON"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/fsf$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fsf$a;->d:Lo/fsf$a;

    new-instance v0, Lo/fsf$a;

    const-string v1, "RSA"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/fsf$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fsf$a;->e:Lo/fsf$a;

    new-instance v0, Lo/fsf$a;

    const-string v1, "DH_DSS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/fsf$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fsf$a;->h:Lo/fsf$a;

    new-instance v0, Lo/fsf$a;

    const-string v1, "DH_RSA"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lo/fsf$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fsf$a;->k:Lo/fsf$a;

    new-instance v0, Lo/fsf$a;

    const-string v1, "PSK"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lo/fsf$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fsf$a;->g:Lo/fsf$a;

    new-instance v0, Lo/fsf$a;

    const-string v1, "EC_DIFFIE_HELLMAN"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lo/fsf$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fsf$a;->f:Lo/fsf$a;

    .line 517
    const/16 v0, 0x9

    new-array v0, v0, [Lo/fsf$a;

    sget-object v1, Lo/fsf$a;->c:Lo/fsf$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$a;->b:Lo/fsf$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$a;->a:Lo/fsf$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$a;->d:Lo/fsf$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$a;->e:Lo/fsf$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$a;->h:Lo/fsf$a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$a;->k:Lo/fsf$a;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$a;->g:Lo/fsf$a;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$a;->f:Lo/fsf$a;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sput-object v0, Lo/fsf$a;->i:[Lo/fsf$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 517
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fsf$a;
    .locals 1

    .line 517
    const-class v0, Lo/fsf$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fsf$a;

    return-object v0
.end method

.method public static values()[Lo/fsf$a;
    .locals 1

    .line 517
    sget-object v0, Lo/fsf$a;->i:[Lo/fsf$a;

    invoke-virtual {v0}, [Lo/fsf$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fsf$a;

    return-object v0
.end method
