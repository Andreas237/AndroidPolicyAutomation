.class Lo/cbv$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbv;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cbv;


# direct methods
.method constructor <init>(Lo/cbv;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lo/cbv$2;->b:Lo/cbv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 161
    iget-object v0, p0, Lo/cbv$2;->b:Lo/cbv;

    invoke-static {v0}, Lo/cbv;->a(Lo/cbv;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "track_point_data.txt"

    iget-object v2, p0, Lo/cbv$2;->b:Lo/cbv;

    invoke-static {v2}, Lo/cbv;->b(Lo/cbv;)Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/cdy;->e(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Z

    move-result v3

    .line 162
    if-eqz v3, :cond_0

    .line 163
    iget-object v0, p0, Lo/cbv$2;->b:Lo/cbv;

    invoke-static {v0}, Lo/cbv;->b(Lo/cbv;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 165
    :cond_0
    return-void
.end method
