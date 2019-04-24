.class public Lo/bea;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bec;


# instance fields
.field private c:Lo/bdx;


# direct methods
.method public constructor <init>(Lo/bdx;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lo/bea;->c:Lo/bdx;

    .line 19
    return-void
.end method


# virtual methods
.method public c(II)V
    .locals 2

    .line 24
    iget-object v0, p0, Lo/bea;->c:Lo/bdx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 27
    iget-object v0, p0, Lo/bea;->c:Lo/bdx;

    invoke-virtual {v0, p2}, Lo/bdx;->c(I)V

    .line 29
    :cond_0
    return-void
.end method
