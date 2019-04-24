.class public Lo/ava;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# instance fields
.field private e:Lo/auz;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lo/auz;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 21
    iput-object p2, p0, Lo/ava;->e:Lo/auz;

    .line 22
    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .locals 1

    .line 27
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 28
    iget-object v0, p0, Lo/ava;->e:Lo/auz;

    if-eqz v0, :cond_0

    .line 30
    iget-object v0, p0, Lo/ava;->e:Lo/auz;

    invoke-interface {v0}, Lo/auz;->b()V

    .line 32
    :cond_0
    return-void
.end method
