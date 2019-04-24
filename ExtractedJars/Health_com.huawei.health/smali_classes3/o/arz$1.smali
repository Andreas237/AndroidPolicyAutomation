.class Lo/arz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arz;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/arz;


# direct methods
.method constructor <init>(Lo/arz;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lo/arz$1;->c:Lo/arz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 74
    iget-object v0, p0, Lo/arz$1;->c:Lo/arz;

    invoke-static {v0}, Lo/arz;->a(Lo/arz;)V

    .line 75
    return-void
.end method

.method public e(II)V
    .locals 1

    .line 80
    iget-object v0, p0, Lo/arz$1;->c:Lo/arz;

    invoke-static {v0, p1, p2}, Lo/arz;->e(Lo/arz;II)V

    .line 81
    return-void
.end method
