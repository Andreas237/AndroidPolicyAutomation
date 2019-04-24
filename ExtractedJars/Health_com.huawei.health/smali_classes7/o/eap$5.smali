.class Lo/eap$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eap;->d(Ljava/lang/String;Lo/eaz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eaz;

.field final synthetic d:Lo/eap;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/eap;Ljava/lang/String;Lo/eaz;)V
    .locals 0

    .line 344
    iput-object p1, p0, Lo/eap$5;->d:Lo/eap;

    iput-object p2, p0, Lo/eap$5;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/eap$5;->c:Lo/eaz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 3

    .line 347
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 348
    iget-object v0, p0, Lo/eap$5;->d:Lo/eap;

    invoke-virtual {v0}, Lo/eap;->h()Z

    .line 350
    iget-object v0, p0, Lo/eap$5;->d:Lo/eap;

    iget-object v1, p0, Lo/eap$5;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/eap$5;->c:Lo/eaz;

    invoke-virtual {v0, v1, v2}, Lo/eap;->e(Ljava/lang/String;Lo/eaz;)V

    goto :goto_0

    .line 351
    :cond_0
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    goto :goto_0

    .line 354
    :cond_1
    iget-object v0, p0, Lo/eap$5;->c:Lo/eaz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 355
    iget-object v0, p0, Lo/eap$5;->c:Lo/eaz;

    invoke-interface {v0, p1, p2}, Lo/eaz;->onPullingChange(Lo/eay;Lo/eba;)V

    .line 358
    :cond_2
    :goto_0
    return-void
.end method
