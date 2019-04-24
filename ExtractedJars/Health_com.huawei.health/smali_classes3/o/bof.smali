.class public final Lo/bof;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/bol;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    invoke-static {}, Lo/bof;->d()Lo/bol;

    move-result-object v0

    sput-object v0, Lo/bof;->c:Lo/bol;

    return-void
.end method

.method public static d()Lo/bol;
    .locals 1

    .line 37
    new-instance v0, Lo/bod;

    invoke-direct {v0}, Lo/bod;-><init>()V

    return-object v0
.end method

.method public static e()Lo/bol;
    .locals 1

    .line 29
    sget-object v0, Lo/bof;->c:Lo/bol;

    return-object v0
.end method
