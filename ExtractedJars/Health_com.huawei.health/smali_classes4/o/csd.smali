.class public abstract Lo/csd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public c:Landroid/content/Context;

.field public d:Lo/cqd;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lo/csd;->c:Landroid/content/Context;

    .line 18
    invoke-static {p1}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v0

    iput-object v0, p0, Lo/csd;->d:Lo/cqd;

    .line 19
    return-void
.end method
