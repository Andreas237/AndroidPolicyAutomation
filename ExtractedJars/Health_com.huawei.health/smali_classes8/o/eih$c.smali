.class public final enum Lo/eih$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eih;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/eih$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/eih$c;

.field private static final synthetic c:[Lo/eih$c;

.field public static final enum e:Lo/eih$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 103
    new-instance v0, Lo/eih$c;

    const-string v1, "Normal"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/eih$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eih$c;->a:Lo/eih$c;

    new-instance v0, Lo/eih$c;

    const-string v1, "Scroll_Mode"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/eih$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/eih$c;->e:Lo/eih$c;

    .line 102
    const/4 v0, 0x2

    new-array v0, v0, [Lo/eih$c;

    sget-object v1, Lo/eih$c;->a:Lo/eih$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/eih$c;->c:[Lo/eih$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 102
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/eih$c;
    .locals 1

    .line 102
    const-class v0, Lo/eih$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/eih$c;

    return-object v0
.end method

.method public static values()[Lo/eih$c;
    .locals 1

    .line 102
    sget-object v0, Lo/eih$c;->c:[Lo/eih$c;

    invoke-virtual {v0}, [Lo/eih$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/eih$c;

    return-object v0
.end method
