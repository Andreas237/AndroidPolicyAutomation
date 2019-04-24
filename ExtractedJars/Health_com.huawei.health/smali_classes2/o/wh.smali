.class public Lo/wh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/wj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    const/4 v0, 0x0

    sput-object v0, Lo/wh;->c:Lo/wj;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/wj;
    .locals 2

    .line 15
    sget-object v0, Lo/wh;->c:Lo/wj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 16
    sget-object v0, Lo/wh;->c:Lo/wj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 17
    new-instance v0, Lo/wf;

    invoke-direct {v0, p0}, Lo/wf;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/wh;->c:Lo/wj;

    goto :goto_0

    .line 20
    :cond_0
    sget-object v0, Lo/wh;->c:Lo/wj;

    invoke-interface {v0, p0}, Lo/wj;->a(Landroid/content/Context;)V

    .line 22
    :cond_1
    :goto_0
    sget-object v0, Lo/wh;->c:Lo/wj;

    return-object v0
.end method
