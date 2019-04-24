.class final Lo/avc$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/avc;->c(Ljava/lang/String;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/avc$1;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 58
    invoke-virtual {p0, p1}, Lo/avc$1;->d(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Void;
    .locals 2

    .line 61
    invoke-static {}, Lo/avc;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "notify thread to handle received push message!"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    iget-object v1, p0, Lo/avc$1;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/ave;->a(Ljava/lang/String;)V

    .line 63
    const/4 v0, 0x0

    return-object v0
.end method
