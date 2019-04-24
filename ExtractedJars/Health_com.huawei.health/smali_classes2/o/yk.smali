.class public Lo/yk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/yk$a;
    }
.end annotation


# static fields
.field private static b:Lo/yk$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/yw;
    .locals 1

    .line 60
    invoke-static {}, Lo/yk;->d()Lo/yk$a;

    move-result-object v0

    invoke-interface {v0, p0}, Lo/yk$a;->e(Landroid/content/Context;)Lo/yw;

    move-result-object v0

    return-object v0
.end method

.method private static d()Lo/yk$a;
    .locals 3

    .line 64
    sget-object v0, Lo/yk;->b:Lo/yk$a;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 65
    new-instance v2, Lo/ym;

    invoke-direct {v2}, Lo/ym;-><init>()V

    .line 66
    invoke-static {v2}, Lo/yk;->d(Lo/yk$a;)V

    .line 68
    :cond_0
    sget-object v0, Lo/yk;->b:Lo/yk$a;

    return-object v0
.end method

.method public static d(Lo/yk$a;)V
    .locals 0

    .line 38
    sput-object p0, Lo/yk;->b:Lo/yk$a;

    .line 39
    return-void
.end method

.method public static e(Landroid/content/Context;)Lo/yr;
    .locals 1

    .line 49
    invoke-static {}, Lo/yk;->d()Lo/yk$a;

    move-result-object v0

    invoke-interface {v0, p0}, Lo/yk$a;->a(Landroid/content/Context;)Lo/yr;

    move-result-object v0

    return-object v0
.end method
