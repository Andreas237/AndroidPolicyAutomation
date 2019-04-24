.class Lo/btj$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/btj;->c()Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/btj;


# direct methods
.method constructor <init>(Lo/btj;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lo/btj$2;->c:Lo/btj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 201
    iget-object v0, p0, Lo/btj$2;->c:Lo/btj;

    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v1

    invoke-virtual {v1}, Lo/btj;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lo/btj;->b(Lo/btj;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 202
    return-void
.end method
