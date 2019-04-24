.class final Lo/atn$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atn;->b(Lo/atn;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/atn;


# direct methods
.method constructor <init>(Lo/atn;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lo/atn$5;->d:Lo/atn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 121
    invoke-virtual {p0, p1}, Lo/atn$5;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 2

    .line 125
    iget-object v0, p0, Lo/atn$5;->d:Lo/atn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/atn;->d(Landroid/os/Handler;)V

    .line 126
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
