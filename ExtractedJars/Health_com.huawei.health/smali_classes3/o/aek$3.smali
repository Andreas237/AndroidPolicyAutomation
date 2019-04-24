.class Lo/aek$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ahi$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aek;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aek;


# direct methods
.method constructor <init>(Lo/aek;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lo/aek$3;->a:Lo/aek;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEvent(Lo/ahi$a;)V
    .locals 3

    .line 110
    const-string v0, "weight_measure_set_user"

    invoke-virtual {p1}, Lo/ahi$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    invoke-virtual {p1}, Lo/ahi$a;->b()Landroid/os/Bundle;

    move-result-object v2

    .line 112
    iget-object v0, p0, Lo/aek$3;->a:Lo/aek;

    invoke-static {v0, v2}, Lo/aek;->c(Lo/aek;Landroid/os/Bundle;)V

    .line 114
    :cond_0
    return-void
.end method
