.class Lo/aln$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aln;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aln;


# direct methods
.method constructor <init>(Lo/aln;)V
    .locals 0

    .line 348
    iput-object p1, p0, Lo/aln$2;->a:Lo/aln;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 351
    iget-object v0, p0, Lo/aln$2;->a:Lo/aln;

    iget-object v1, p0, Lo/aln$2;->a:Lo/aln;

    invoke-static {v1}, Lo/aln;->d(Lo/aln;)Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.huawei.health.AUTO_TRACK_END"

    invoke-static {v0, v1, v2}, Lo/aln;->b(Lo/aln;Landroid/content/Context;Ljava/lang/String;)V

    .line 352
    return-void
.end method
