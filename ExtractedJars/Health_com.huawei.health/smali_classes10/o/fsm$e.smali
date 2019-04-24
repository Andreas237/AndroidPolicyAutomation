.class public final enum Lo/fsm$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fsm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fsm$e;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fsm$e;

.field public static final enum b:Lo/fsm$e;

.field public static final enum d:Lo/fsm$e;

.field public static final enum e:Lo/fsm$e;

.field private static final synthetic g:[Lo/fsm$e;


# instance fields
.field private c:Ljava/lang/String;

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 44
    new-instance v0, Lo/fsm$e;

    const-string v1, "MASTER_SECRET_LABEL"

    const-string v2, "master secret"

    const/4 v3, 0x0

    const/16 v4, 0x30

    invoke-direct {v0, v1, v3, v2, v4}, Lo/fsm$e;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lo/fsm$e;->a:Lo/fsm$e;

    .line 47
    new-instance v0, Lo/fsm$e;

    const-string v1, "KEY_EXPANSION_LABEL"

    const-string v2, "key expansion"

    const/4 v3, 0x1

    const/16 v4, 0x80

    invoke-direct {v0, v1, v3, v2, v4}, Lo/fsm$e;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lo/fsm$e;->e:Lo/fsm$e;

    .line 50
    new-instance v0, Lo/fsm$e;

    const-string v1, "CLIENT_FINISHED_LABEL"

    const-string v2, "client finished"

    const/4 v3, 0x2

    const/16 v4, 0xc

    invoke-direct {v0, v1, v3, v2, v4}, Lo/fsm$e;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lo/fsm$e;->b:Lo/fsm$e;

    .line 53
    new-instance v0, Lo/fsm$e;

    const-string v1, "SERVER_FINISHED_LABEL"

    const-string v2, "server finished"

    const/4 v3, 0x3

    const/16 v4, 0xc

    invoke-direct {v0, v1, v3, v2, v4}, Lo/fsm$e;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lo/fsm$e;->d:Lo/fsm$e;

    .line 40
    const/4 v0, 0x4

    new-array v0, v0, [Lo/fsm$e;

    sget-object v1, Lo/fsm$e;->a:Lo/fsm$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fsm$e;->e:Lo/fsm$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fsm$e;->b:Lo/fsm$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/fsm$e;->d:Lo/fsm$e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/fsm$e;->g:[Lo/fsm$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)V"
        }
    .end annotation

    .line 58
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 59
    iput-object p3, p0, Lo/fsm$e;->c:Ljava/lang/String;

    .line 60
    iput p4, p0, Lo/fsm$e;->k:I

    .line 61
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fsm$e;
    .locals 1

    .line 40
    const-class v0, Lo/fsm$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fsm$e;

    return-object v0
.end method

.method public static values()[Lo/fsm$e;
    .locals 1

    .line 40
    sget-object v0, Lo/fsm$e;->g:[Lo/fsm$e;

    invoke-virtual {v0}, [Lo/fsm$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fsm$e;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 72
    iget v0, p0, Lo/fsm$e;->k:I

    return v0
.end method

.method public d()[B
    .locals 2

    .line 68
    iget-object v0, p0, Lo/fsm$e;->c:Ljava/lang/String;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method
