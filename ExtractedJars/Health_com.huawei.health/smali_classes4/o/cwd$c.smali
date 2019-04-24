.class Lo/cwd$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field private static c:Lo/cwd;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 23
    new-instance v0, Lo/cwd;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cwd;-><init>(Lo/cwd$4;)V

    sput-object v0, Lo/cwd$c;->c:Lo/cwd;

    return-void
.end method

.method static synthetic a()Lo/cwd;
    .locals 1

    .line 22
    sget-object v0, Lo/cwd$c;->c:Lo/cwd;

    return-object v0
.end method
