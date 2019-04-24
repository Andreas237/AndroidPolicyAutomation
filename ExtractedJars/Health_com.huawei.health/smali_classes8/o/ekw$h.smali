.class public final enum Lo/ekw$h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ekw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/ekw$h;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/ekw$h;

.field private static final synthetic c:[Lo/ekw$h;

.field public static final enum e:Lo/ekw$h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 681
    new-instance v0, Lo/ekw$h;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/ekw$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekw$h;->e:Lo/ekw$h;

    new-instance v0, Lo/ekw$h;

    const-string v1, "MINUTES"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/ekw$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekw$h;->a:Lo/ekw$h;

    .line 680
    const/4 v0, 0x2

    new-array v0, v0, [Lo/ekw$h;

    sget-object v1, Lo/ekw$h;->e:Lo/ekw$h;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/ekw$h;->a:Lo/ekw$h;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/ekw$h;->c:[Lo/ekw$h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 680
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/ekw$h;
    .locals 1

    .line 680
    const-class v0, Lo/ekw$h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/ekw$h;

    return-object v0
.end method

.method public static values()[Lo/ekw$h;
    .locals 1

    .line 680
    sget-object v0, Lo/ekw$h;->c:[Lo/ekw$h;

    invoke-virtual {v0}, [Lo/ekw$h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ekw$h;

    return-object v0
.end method
