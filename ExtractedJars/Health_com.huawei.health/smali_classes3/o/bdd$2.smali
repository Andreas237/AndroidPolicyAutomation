.class Lo/bdd$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bdd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bdd;


# direct methods
.method constructor <init>(Lo/bdd;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lo/bdd$2;->d:Lo/bdd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 196
    iget-object v0, p0, Lo/bdd$2;->d:Lo/bdd;

    invoke-virtual {v0}, Lo/bdd;->b()V

    .line 197
    return-void
.end method

.method public d()V
    .locals 2

    .line 202
    const-string v0, "AssistantLinkClickChecker"

    const-string v1, "checkClickListener performCancel"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    return-void
.end method
