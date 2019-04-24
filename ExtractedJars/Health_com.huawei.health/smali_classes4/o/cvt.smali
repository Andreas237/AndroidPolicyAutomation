.class public abstract Lo/cvt;
.super Ljava/lang/Object;

# interfaces
.implements Lo/cvq;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cvt$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/Context;Lo/cvt$d;)Lo/cvt;
    .locals 2

    new-instance v0, Lo/cvs;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lo/cvs;-><init>(Landroid/content/Context;Lo/cvt$d;)V

    return-object v0
.end method


# virtual methods
.method public abstract d()Z
.end method

.method public abstract e()V
.end method
