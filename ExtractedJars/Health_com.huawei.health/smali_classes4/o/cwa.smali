.class public Lo/cwa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/cmj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    const/4 v0, 0x0

    sput-object v0, Lo/cwa;->c:Lo/cmj;

    return-void
.end method

.method public static d()Lo/cmj;
    .locals 1

    .line 17
    sget-object v0, Lo/cwa;->c:Lo/cmj;

    if-nez v0, :cond_0

    .line 19
    new-instance v0, Lo/cmj;

    invoke-direct {v0}, Lo/cmj;-><init>()V

    sput-object v0, Lo/cwa;->c:Lo/cmj;

    .line 22
    :cond_0
    sget-object v0, Lo/cwa;->c:Lo/cmj;

    return-object v0
.end method
