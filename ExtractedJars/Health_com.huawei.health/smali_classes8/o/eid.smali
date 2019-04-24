.class public Lo/eid;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Z

.field private d:Lo/ejn;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eid;->c:Z

    .line 10
    new-instance v0, Lo/emh;

    invoke-direct {v0}, Lo/emh;-><init>()V

    iput-object v0, p0, Lo/eid;->d:Lo/ejn;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lo/eid;->c:Z

    return v0
.end method

.method public b(Lo/eid;)V
    .locals 1

    .line 29
    iget-boolean v0, p1, Lo/eid;->c:Z

    iput-boolean v0, p0, Lo/eid;->c:Z

    .line 30
    iget-object v0, p1, Lo/eid;->d:Lo/ejn;

    iput-object v0, p0, Lo/eid;->d:Lo/ejn;

    .line 31
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 13
    iput-boolean p1, p0, Lo/eid;->c:Z

    .line 14
    return-void
.end method

.method public c(Lo/ejn;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lo/eid;->d:Lo/ejn;

    .line 22
    return-void
.end method

.method public e()Lo/ejn;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/eid;->d:Lo/ejn;

    return-object v0
.end method
