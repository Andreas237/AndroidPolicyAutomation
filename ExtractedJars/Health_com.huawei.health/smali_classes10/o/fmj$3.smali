.class Lo/fmj$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fmj;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fmj;


# direct methods
.method constructor <init>(Lo/fmj;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lo/fmj$3;->d:Lo/fmj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 121
    invoke-static {}, Lo/fmj;->e()Lo/fty;

    move-result-object v0

    iget-object v1, p0, Lo/fmj$3;->d:Lo/fmj;

    invoke-static {v1}, Lo/fmj;->c(Lo/fmj;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/fty;->c(Ljava/lang/String;)V

    .line 122
    return-void
.end method
