.class Lo/emz$1$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/emz$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/emz$1;


# direct methods
.method constructor <init>(Lo/emz$1;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lo/emz$1$5;->b:Lo/emz$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 163
    iget-object v0, p0, Lo/emz$1$5;->b:Lo/emz$1;

    iget-object v0, v0, Lo/emz$1;->c:Lo/emz$a;

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lo/emz$1$5;->b:Lo/emz$1;

    iget-object v0, v0, Lo/emz$1;->c:Lo/emz$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/emz$a;->c(Landroid/graphics/Bitmap;)V

    .line 165
    :cond_0
    return-void
.end method
