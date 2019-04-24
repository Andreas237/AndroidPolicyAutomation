.class final Lo/avc$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/avc;->c(Landroid/content/Context;Ljava/lang/String;)Lo/brd;
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic d:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lo/avc$5;->d:Landroid/content/Context;

    iput-object p2, p0, Lo/avc$5;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 76
    invoke-virtual {p0, p1}, Lo/avc$5;->c(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Void;
    .locals 3

    .line 79
    invoke-static {}, Lo/avc;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "use thread to handle received pushToken."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    iget-object v1, p0, Lo/avc$5;->d:Landroid/content/Context;

    iget-object v2, p0, Lo/avc$5;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/ave;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 81
    const/4 v0, 0x0

    return-object v0
.end method
