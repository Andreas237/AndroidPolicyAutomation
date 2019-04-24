.class public final enum Lo/akh$i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/akh$i;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/akh$i;

.field private static final synthetic b:[Lo/akh$i;

.field public static final enum d:Lo/akh$i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 91
    new-instance v0, Lo/akh$i;

    const-string v1, "REGISTER_SOFTAP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/akh$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/akh$i;->a:Lo/akh$i;

    .line 92
    new-instance v0, Lo/akh$i;

    const-string v1, "REGISTER_NORFORM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/akh$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/akh$i;->d:Lo/akh$i;

    .line 90
    const/4 v0, 0x2

    new-array v0, v0, [Lo/akh$i;

    sget-object v1, Lo/akh$i;->a:Lo/akh$i;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/akh$i;->d:Lo/akh$i;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/akh$i;->b:[Lo/akh$i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 90
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/akh$i;
    .locals 1

    .line 90
    const-class v0, Lo/akh$i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/akh$i;

    return-object v0
.end method

.method public static values()[Lo/akh$i;
    .locals 1

    .line 90
    sget-object v0, Lo/akh$i;->b:[Lo/akh$i;

    invoke-virtual {v0}, [Lo/akh$i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/akh$i;

    return-object v0
.end method
