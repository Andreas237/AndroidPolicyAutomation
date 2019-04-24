.class Lo/fez$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ffa$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fez;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fez;


# direct methods
.method constructor <init>(Lo/fez;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lo/fez$4;->a:Lo/fez;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lo/fez$4;->a:Lo/fez;

    invoke-static {v0, p2}, Lo/fez;->d(Lo/fez;I)I

    .line 61
    iget-object v0, p0, Lo/fez$4;->a:Lo/fez;

    invoke-static {v0, p2}, Lo/fez;->c(Lo/fez;I)I

    .line 62
    iget-object v0, p0, Lo/fez$4;->a:Lo/fez;

    iget v0, v0, Lo/fez;->b:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 63
    iget-object v0, p0, Lo/fez$4;->a:Lo/fez;

    invoke-static {v0}, Lo/fez;->b(Lo/fez;)V

    .line 65
    :cond_0
    return-void
.end method
