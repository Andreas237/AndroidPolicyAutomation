.class public final enum Lo/eit$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eit;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/eit$b;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lo/eit$b;

.field public static final enum b:Lo/eit$b;

.field public static final enum c:Lo/eit$b;

.field public static final enum e:Lo/eit$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 72
    new-instance v0, Lo/eit$b;

    const-string v1, "FIRST_PARTY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/eit$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eit$b;->e:Lo/eit$b;

    new-instance v0, Lo/eit$b;

    const-string v1, "SECOND_PARTY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/eit$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eit$b;->b:Lo/eit$b;

    new-instance v0, Lo/eit$b;

    const-string v1, "THIRD_PARTY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/eit$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eit$b;->c:Lo/eit$b;

    .line 71
    const/4 v0, 0x3

    new-array v0, v0, [Lo/eit$b;

    sget-object v1, Lo/eit$b;->e:Lo/eit$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/eit$b;->b:Lo/eit$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/eit$b;->c:Lo/eit$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/eit$b;->a:[Lo/eit$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 71
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/eit$b;
    .locals 1

    .line 71
    const-class v0, Lo/eit$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/eit$b;

    return-object v0
.end method

.method public static values()[Lo/eit$b;
    .locals 1

    .line 71
    sget-object v0, Lo/eit$b;->a:[Lo/eit$b;

    invoke-virtual {v0}, [Lo/eit$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/eit$b;

    return-object v0
.end method
