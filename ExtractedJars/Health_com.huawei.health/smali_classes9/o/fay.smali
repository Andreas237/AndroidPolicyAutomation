.class public Lo/fay;
.super Lo/fbd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fay$c;
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lo/fbj;

.field private d:Lo/fay$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 41
    invoke-direct {p0}, Lo/fbd;-><init>()V

    .line 37
    new-instance v0, Lo/fbj;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lo/fbj;-><init>(J)V

    iput-object v0, p0, Lo/fay;->c:Lo/fbj;

    .line 39
    new-instance v0, Lo/fay$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/fay$c;-><init>(Lo/fay;Lo/fay$5;)V

    iput-object v0, p0, Lo/fay;->d:Lo/fay$c;

    .line 42
    iput-object p1, p0, Lo/fay;->b:Landroid/content/Context;

    .line 43
    return-void
.end method

.method static synthetic e(Lo/fay;)Landroid/content/Context;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/fay;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a()Lo/fbd$a;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/fay;->d:Lo/fay$c;

    return-object v0
.end method

.method protected c()Lo/fbm;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/fay;->c:Lo/fbj;

    return-object v0
.end method
