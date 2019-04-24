.class public Lo/eac;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mAdapter:Lo/eab;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 0

    .line 35
    return-void
.end method

.method public getAdapter()Lo/eab;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/eac;->mAdapter:Lo/eab;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eab;

    return-object v0
.end method

.method public init(Landroid/content/Context;)V
    .locals 0

    .line 28
    return-void
.end method

.method public setAdapter(Lo/eab;)V
    .locals 1

    .line 20
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eab;

    iput-object v0, p0, Lo/eac;->mAdapter:Lo/eab;

    .line 21
    return-void
.end method
