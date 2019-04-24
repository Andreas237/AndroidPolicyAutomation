.class public final enum Lo/fha$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fha;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fha$d;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lo/fha$d;

.field public static final enum b:Lo/fha$d;

.field public static final enum c:Lo/fha$d;

.field public static final enum d:Lo/fha$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 664
    new-instance v0, Lo/fha$d;

    const-string v1, "Common"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fha$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fha$d;->b:Lo/fha$d;

    new-instance v0, Lo/fha$d;

    const-string v1, "Holo"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/fha$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fha$d;->c:Lo/fha$d;

    new-instance v0, Lo/fha$d;

    const-string v1, "None"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/fha$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fha$d;->d:Lo/fha$d;

    .line 663
    const/4 v0, 0x3

    new-array v0, v0, [Lo/fha$d;

    sget-object v1, Lo/fha$d;->b:Lo/fha$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fha$d;->c:Lo/fha$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fha$d;->d:Lo/fha$d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/fha$d;->a:[Lo/fha$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 663
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fha$d;
    .locals 1

    .line 663
    const-class v0, Lo/fha$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fha$d;

    return-object v0
.end method

.method public static values()[Lo/fha$d;
    .locals 1

    .line 663
    sget-object v0, Lo/fha$d;->a:[Lo/fha$d;

    invoke-virtual {v0}, [Lo/fha$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fha$d;

    return-object v0
.end method
