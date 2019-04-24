.class public Lo/bzu$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bzu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Ljava/lang/String;Lo/cza;)V
    .locals 2

    .line 23
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    new-instance v1, Lo/bzu$c$1;

    invoke-direct {v1, p1}, Lo/bzu$c$1;-><init>(Lo/cza;)V

    invoke-virtual {v0, p0, v1}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 46
    return-void
.end method
