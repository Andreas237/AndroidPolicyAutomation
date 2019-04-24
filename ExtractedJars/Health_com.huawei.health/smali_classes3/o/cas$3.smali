.class Lo/cas$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cas;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cas;


# direct methods
.method constructor <init>(Lo/cas;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lo/cas$3;->d:Lo/cas;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 78
    iget-object v0, p0, Lo/cas$3;->d:Lo/cas;

    invoke-static {v0}, Lo/cas;->b(Lo/cas;)Lo/cav;

    move-result-object v0

    sget-object v1, Lo/cau;->e:Lo/cau;

    invoke-virtual {v0, v1}, Lo/cav;->a(Lo/cau;)V

    .line 79
    iget-object v0, p0, Lo/cas$3;->d:Lo/cas;

    invoke-static {v0}, Lo/cas;->b(Lo/cas;)Lo/cav;

    move-result-object v0

    sget-object v1, Lo/cau;->e:Lo/cau;

    invoke-virtual {v0, v1}, Lo/cav;->c(Lo/cau;)V

    .line 80
    iget-object v0, p0, Lo/cas$3;->d:Lo/cas;

    invoke-static {v0}, Lo/cas;->b(Lo/cas;)Lo/cav;

    move-result-object v0

    invoke-virtual {v0}, Lo/cav;->c()V

    .line 81
    return-void
.end method
