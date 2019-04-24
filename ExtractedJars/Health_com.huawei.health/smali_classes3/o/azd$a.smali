.class public final enum Lo/azd$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/azd$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/azd$a;

.field public static final enum b:Lo/azd$a;

.field public static final enum c:Lo/azd$a;

.field public static final enum d:Lo/azd$a;

.field public static final enum e:Lo/azd$a;

.field public static final enum g:Lo/azd$a;

.field public static final enum h:Lo/azd$a;

.field public static final enum i:Lo/azd$a;

.field private static final synthetic k:[Lo/azd$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 21
    new-instance v0, Lo/azd$a;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/azd$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/azd$a;->c:Lo/azd$a;

    new-instance v0, Lo/azd$a;

    const-string v1, "NO_NETWORK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/azd$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/azd$a;->e:Lo/azd$a;

    new-instance v0, Lo/azd$a;

    const-string v1, "DISCONNECT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/azd$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/azd$a;->b:Lo/azd$a;

    new-instance v0, Lo/azd$a;

    const-string v1, "HOST_FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/azd$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/azd$a;->d:Lo/azd$a;

    new-instance v0, Lo/azd$a;

    const-string v1, "CONNECT_FAILED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/azd$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/azd$a;->a:Lo/azd$a;

    new-instance v0, Lo/azd$a;

    const-string v1, "AUTH_FAILED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/azd$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/azd$a;->g:Lo/azd$a;

    new-instance v0, Lo/azd$a;

    const-string v1, "AUTH_TIMEOUT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lo/azd$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/azd$a;->i:Lo/azd$a;

    new-instance v0, Lo/azd$a;

    const-string v1, "AUTH_FAILED_ST"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lo/azd$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/azd$a;->h:Lo/azd$a;

    .line 19
    const/16 v0, 0x8

    new-array v0, v0, [Lo/azd$a;

    sget-object v1, Lo/azd$a;->c:Lo/azd$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/azd$a;->e:Lo/azd$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/azd$a;->b:Lo/azd$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/azd$a;->d:Lo/azd$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/azd$a;->a:Lo/azd$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/azd$a;->g:Lo/azd$a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/azd$a;->i:Lo/azd$a;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/azd$a;->h:Lo/azd$a;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lo/azd$a;->k:[Lo/azd$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/azd$a;
    .locals 1

    .line 19
    const-class v0, Lo/azd$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/azd$a;

    return-object v0
.end method

.method public static values()[Lo/azd$a;
    .locals 1

    .line 19
    sget-object v0, Lo/azd$a;->k:[Lo/azd$a;

    invoke-virtual {v0}, [Lo/azd$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/azd$a;

    return-object v0
.end method
