.class Lo/ara$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ara;->a(Lo/aqz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/ara;


# direct methods
.method constructor <init>(Lo/ara;)V
    .locals 0

    .line 332
    iput-object p1, p0, Lo/ara$1;->a:Lo/ara;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 336
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 337
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 339
    iget-object v0, p0, Lo/ara$1;->a:Lo/ara;

    invoke-virtual {v0, v1}, Lo/ara;->e(Ljava/lang/String;)V

    .line 341
    :cond_0
    return-void
.end method
