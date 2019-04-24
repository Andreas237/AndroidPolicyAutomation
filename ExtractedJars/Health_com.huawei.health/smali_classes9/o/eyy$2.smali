.class Lo/eyy$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eyy;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/eyy;


# direct methods
.method constructor <init>(Lo/eyy;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lo/eyy$2;->e:Lo/eyy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 3

    .line 245
    iget-object v0, p0, Lo/eyy$2;->e:Lo/eyy;

    iget-object v1, p0, Lo/eyy$2;->e:Lo/eyy;

    invoke-static {v1}, Lo/eyy;->c(Lo/eyy;)Lo/eih;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lo/eih;->c(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eyy;->a(Lo/eyy;Ljava/lang/String;)Ljava/lang/String;

    .line 246
    iget-object v0, p0, Lo/eyy$2;->e:Lo/eyy;

    iget-object v1, p0, Lo/eyy$2;->e:Lo/eyy;

    invoke-static {v1}, Lo/eyy;->h(Lo/eyy;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, p0, Lo/eyy$2;->e:Lo/eyy;

    invoke-static {v2}, Lo/eyy;->c(Lo/eyy;)Lo/eih;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Lo/eih;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/eyy;->d(Lo/eyy;Landroid/widget/TextView;Ljava/lang/String;)V

    .line 247
    return-void
.end method
