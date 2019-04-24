.class public final enum Lo/azd$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/azd$c;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lo/azd$c;

.field public static final enum b:Lo/azd$c;

.field public static final enum c:Lo/azd$c;

.field public static final enum e:Lo/azd$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 11
    new-instance v0, Lo/azd$c;

    const-string v1, "Logging"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/azd$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/azd$c;->b:Lo/azd$c;

    new-instance v0, Lo/azd$c;

    const-string v1, "Logged"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/azd$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/azd$c;->e:Lo/azd$c;

    new-instance v0, Lo/azd$c;

    const-string v1, "Logout"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/azd$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/azd$c;->c:Lo/azd$c;

    .line 9
    const/4 v0, 0x3

    new-array v0, v0, [Lo/azd$c;

    sget-object v1, Lo/azd$c;->b:Lo/azd$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/azd$c;->e:Lo/azd$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/azd$c;->c:Lo/azd$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/azd$c;->a:[Lo/azd$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 9
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/azd$c;
    .locals 1

    .line 9
    const-class v0, Lo/azd$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/azd$c;

    return-object v0
.end method

.method public static values()[Lo/azd$c;
    .locals 1

    .line 9
    sget-object v0, Lo/azd$c;->a:[Lo/azd$c;

    invoke-virtual {v0}, [Lo/azd$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/azd$c;

    return-object v0
.end method
