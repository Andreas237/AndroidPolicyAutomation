.class Lo/enk$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enk;->setSeletion(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/enk;


# direct methods
.method constructor <init>(Lo/enk;)V
    .locals 0

    .line 352
    iput-object p1, p0, Lo/enk$5;->a:Lo/enk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 355
    iget-object v0, p0, Lo/enk$5;->a:Lo/enk;

    iget-object v1, p0, Lo/enk$5;->a:Lo/enk;

    iget v1, v1, Lo/enk;->b:I

    iget-object v2, p0, Lo/enk$5;->a:Lo/enk;

    iget v2, v2, Lo/enk;->i:I

    mul-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/enk;->smoothScrollTo(II)V

    .line 356
    return-void
.end method
